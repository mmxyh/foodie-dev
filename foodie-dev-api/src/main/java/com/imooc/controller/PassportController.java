package com.imooc.controller;

import com.imooc.pojo.bo.UserBO;
import com.imooc.service.UserService;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * TODO：校验前后端都需要做
 *
 * @Description： 用户
 * @Author: hmm
 * @Date: 2021/6/18
 */
@Api(value = "注册登录", tags = {"用户注册登录的相关接口"})
@RestController
@RequestMapping("passport")
public class PassportController {
    @Autowired
    private UserService userService;

    /**
     * 用户名是否存在
     * @param username
     * @return
     */
    @ApiOperation(value = "用户名是否存在", notes = "用户名是否存在", httpMethod = "GET")
    @ApiImplicitParam(name = "username",value = "用户名",dataType = "String")
    @GetMapping("/usernameIsExist")
    public IMOOCJSONResult usernameIsExist(@RequestParam String username) {
        // 1.判断用户名不能为空
        if (StringUtils.isBlank(username)) {
            return IMOOCJSONResult.errorMsg("用户名不能为空");
        }
        // 2.查找注册的用户名是否存在
        boolean isExist = userService.queryUserNameIsExist(username);
        if (isExist) {
            return IMOOCJSONResult.errorMsg("用户名已存在");
        }

        // 2.请求成功，用户名没有重复
        return IMOOCJSONResult.ok();
    }

    /**
     * 用户注册
     * @param userBO
     * @return
     */
    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @PostMapping("/regist")
    public IMOOCJSONResult regist(@RequestBody UserBO userBO) {
        String username = userBO.getUsername();
        String password = userBO.getPassword();
        String cpnfirmPwd = userBO.getConfirmPassword();
        // 0.判断用户名和密码必须不为空
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password) || StringUtils.isBlank(cpnfirmPwd)) {
            return IMOOCJSONResult.errorMsg("用户名或密码不能为空");
        }
        // 1.查询用户名是否存在
        boolean isExist = userService.queryUserNameIsExist(username);
        if (isExist) {
            return IMOOCJSONResult.errorMsg("用户名已存在");
        }
        // 2.密码长度不能少于6位
        if (password.length() < 6) {
            return IMOOCJSONResult.errorMsg("密码长度不能少于6");
        }
        // 3.查询两次密码是否一致
        if (!password.equals(cpnfirmPwd)) {
            return IMOOCJSONResult.errorMsg("两次密码输入不一致");
        }
        // 4.实现注册
        userService.createUser(userBO);

        return IMOOCJSONResult.ok();
    }

}
