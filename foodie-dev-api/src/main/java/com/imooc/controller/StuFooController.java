package com.imooc.controller;

import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author: hmm
 * @date: 2020/11/6 17:10
 */
@ApiIgnore
@RestController
public class StuFooController {
    @Autowired
    private StuService stuService;

    @GetMapping("/getStu")
    public Object getStu(int id){
        return stuService.getStuInfo(id);
    }

    @PostMapping("/saveStu")
    public Object saveStu(){
         stuService.saveStu();
        return "OK";
    }


//    多次调用结果不同即不包含幂等性
    @PostMapping("/updateStu")
    public Object updateStu(int id){
        stuService.updateStu(id);
        return "OK";
    }


    @PostMapping("/deleteStu")
    public Object deleteStu(int id){
        stuService.deleteStu(id);
        return "OK";
    }
}
