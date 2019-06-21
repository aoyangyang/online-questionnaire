package com.looc.onlinequestionnaire.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName StaticHtmlWeb.java
 * @Description TODO 构建首页 静态页面
 * @createTime 2019年06月21日 23:52:00
 */
@Controller
public class StaticHtmlWeb {
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("register")
    public String register(){
        return "/html/register";
    }

    @GetMapping("/login")
    public String login(){
        return "/html/login";
    }

    @GetMapping("/html/contact")
    public String contact(){
        return "/html/contact";
    }
}
