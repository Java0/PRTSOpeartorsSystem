package com.goodtime.arkbackend.controller.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ControllerConfig implements WebMvcConfigurer {


    public static String webAddress;


    @Value("${web-server.address}")
    private void initAddress(String address){
        webAddress = address;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //允许跨域的路径
        registry.addMapping("/**")
                //允许跨域请求的域名
                .allowedOriginPatterns(webAddress)
                //允许的header属性
                .allowedHeaders("*")
                //允许的方法
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                //是否允许证书
                .allowCredentials(true)
                //跨域超时时间
                .maxAge(100000);
    }
}
