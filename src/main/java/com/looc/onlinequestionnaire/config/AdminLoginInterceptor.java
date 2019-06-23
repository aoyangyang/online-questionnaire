package com.looc.onlinequestionnaire.config;

import com.looc.onlinequestionnaire.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName AdminLoginInterceptor.java
 * @Description TODO 管理员拦截器
 * @createTime 2019年06月22日 11:53:00
 */
public class AdminLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("loginUser");

        //判断是否为管理员
        if (user==null || !user.getGroups().equals(0)){
            request.getSession().setAttribute("msg", "没有登录权限,登录管理员页面需要管理员权限");
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
