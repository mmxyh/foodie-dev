package com.imooc.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: hmm
 * @date: 2022/1/18
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // RestTemplate HTTP 请求工具，提供了常见的REST请求方案的模版
    // 注入bean
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    // 实现静态资源的映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/") // 映射swagger2
                .addResourceLocations("file:/workspaces/images/");      // 映射本地静态资源
    }


}
