package com.imooc.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author: hmm
 * @date: 2020/9/27 13:51
 */
// 忽略api
@ApiIgnore
//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return " ";
    }
}
