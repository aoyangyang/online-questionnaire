package com.looc.onlinequestionnaire.config;

import com.looc.onlinequestionnaire.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName UserLoginInterceptor.java
 * @Description TODO
 * @createTime 2019年06月22日 11:48:00
 */
public class UserLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("loginUser");

        //判断是否为用户
        if (user==null || !user.getGroups().equals(1)){
            request.getSession().setAttribute("msg", "没有登录权限，登录用户需要用户权限");
            request.getSession().setAttribute("errorCode", "error");
            request.getRequestDispatcher("/404").forward(request, response);
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
