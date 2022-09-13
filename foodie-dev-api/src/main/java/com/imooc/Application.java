package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author: hmm
 * @date: 2020/9/27 13:49
 */
@SpringBootApplication
// 扫描mybaties通用 mapper 所在的包
@MapperScan(basePackages = "com.imooc.mapper")
// @ComponentScan默认扫描com.imooc
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.imooc", "org.n3r.idworker"})
@EnableTransactionManagement
@EnableScheduling
public class Application  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
