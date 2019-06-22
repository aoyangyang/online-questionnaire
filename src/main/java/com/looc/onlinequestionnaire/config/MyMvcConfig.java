package com.looc.onlinequestionnaire.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName MyMvcConfig.java
 * @Description TODO
 * @createTime 2019年06月22日 11:43:00
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    /**
     * @Author chenpeng
     * @Description //TODO 登录拦截器
     * @Date 11:48 
     * @Param [registry]
     * @return void
     **/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserLoginInterceptor())
                .addPathPatterns("/admin**");

        registry.addInterceptor(new AdminLoginInterceptor())
                .addPathPatterns("/users**");

    }




}
