package com.looc.onlinequestionnaire.service;

import com.looc.onlinequestionnaire.bean.User;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2019年06月22日 00:53:00
 */
public interface UserService {

    /**
     * @Author chenpeng
     * @Description //TODO 写入数据库
     * @Date 1:22 
     * @Param [use]
     * @return boolean
     **/
    boolean register(User user);

    /**
     * @Author chenpeng
     * @Description //TODO 登录
     * @Date 1:47
     * @Param [use]
     * @return boolean
     **/
    boolean login(User user);

    /**
     * @Author chenpeng
     * @Description //TODO 添加问卷
     * @Date 11:14 
     * @Param [datas]
     * @return void
     **/
    void userAddQ(String datas,String title);
}
