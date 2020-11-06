package com.imooc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hmm
 * @date: 2020/9/27 13:51
 */
//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return " ";
    }
}
