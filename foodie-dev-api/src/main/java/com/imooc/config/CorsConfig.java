package com.imooc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Description： 跨域访问
 * @Author: hmm
 * @Date: 2021/7/18
 */
@Configuration
public class CorsConfig {
    public CorsConfig(){
    }

    @Bean
    public CorsFilter corsFilter(){
        // 1.添加cros配置信息
        CorsConfiguration config = new CorsConfiguration();
//        config.addAllowedOrigin("http://localhost:8080");
        // tomcat部署前端项目url
        config.addAllowedOrigin("http://192.168.168.11:8080");
        config.addAllowedOrigin("http://www.tomcats.com:8080");
        // nginx部署前端项目url
        config.addAllowedOrigin("http://192.168.168.11:90");
        config.addAllowedOrigin("http://192.168.168.11:89");
        config.addAllowedOrigin("http://www.tomcats.com:90");
        config.addAllowedOrigin("http://www.tomcats.com:89");
        // 放行所有站点
        config.addAllowedOrigin("*");


        // 设置是否发送coolie信息
        config.setAllowCredentials(true);

        // 设置允许的请求方式
        config.addAllowedMethod("*");

        // 设置允许的header
        config.addAllowedHeader("*");

        // 2.为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", config);

        // 3.返回重新定义好的corsSource
        return new CorsFilter(corsSource);

    }

}
