package com.imooc.controller;

import com.imooc.pojo.bo.ShopcatBO;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description：
 * @Author: hmm
 * @Date: 2021/7/28
 */
@Api(value = "购物车接口", tags = {"购物车接口的相关api"})
@RestController
@RequestMapping("shopcat")
public class ShopcatController {

    @ApiOperation(value = "添加商品到购物车", notes = "添加商品到购物车", httpMethod = "POST")
    @PostMapping("/add")
    public IMOOCJSONResult add(@RequestParam String userId,
                               @RequestBody ShopcatBO shopcatBO,
                               HttpServletRequest request,
                               HttpServletResponse response) {
        if (StringUtils.isBlank(userId)) {
            return IMOOCJSONResult.errorMsg("userId不存在");
        }
        // TODO 前端用户在登录的情况下，添加商品到购物车，会同时在后端同步购物车到redis缓存
        return IMOOCJSONResult.ok();
    }
}
