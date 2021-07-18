package com.imooc.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: hmm
 * @date: 2020/9/27 13:51
 */
// 忽略api
@ApiIgnore
//@Controller
@RestController
public class HelloController {
    final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Object hello(){

        logger.debug("debug:hello");
        logger.info("info:hello");
        logger.warn("warn:hello");
        logger.error("error:hello");
        return "hello world ";
    }

    @GetMapping("/setSession")
    public Object setSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("userInfo","new user");
        // 设置过期时间
        session.setMaxInactiveInterval(3600);
        session.getAttribute("userInfo");
        // 手动移除session
//        session.removeAttribute("userInfo");
        return "ok";
    }
}
