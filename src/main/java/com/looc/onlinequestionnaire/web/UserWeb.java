package com.looc.onlinequestionnaire.web;

import com.looc.onlinequestionnaire.bean.User;
import com.looc.onlinequestionnaire.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2019年06月22日 00:52:00
 */
@Controller
public class UserWeb {
    @Autowired
    private UserServiceImpl userServiceImpl;

    /**
     * @Author chenpeng
     * @Description //TODO 注册
     * @Date 1:45 
     * @Param [user]
     * @return java.lang.String
     **/
    @PutMapping("/user")
    public String register(User user){
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dfs.format(new Date());

        user.setGroups(1);
        user.setCreated_at(format);
        user.setUpdated_at(format);

        //持久化
        boolean flag = false;
        try {
            flag = userServiceImpl.register(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (!flag){
            return "redirect:/html/404.html";
        }

        return "redirect:/html/login.html";
    }

    /**
     * @Author chenpeng
     * @Description //TODO 登录
     * @Date 1:45 
     * @Param [user]
     * @return java.lang.String
     **/
    @PostMapping("/user")
    public String login(User user){
        boolean flag = false;
        try {
            flag = userServiceImpl.login(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (flag){
            return "redirect:/html/index.html";
        }

        return "redirect:/html/login.html";
    }
}
