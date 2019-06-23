package com.looc.onlinequestionnaire.service;

import com.looc.onlinequestionnaire.bean.User;
import com.looc.onlinequestionnaire.dao.UserRegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName UserSerivceImpl.java
 * @Description TODO
 * @createTime 2019年06月22日 00:55:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRegisterDao userRegisterDao;

    @Autowired
    private HttpSession httpSession;
    /**
     * @Author chenpeng
     * @Description //TODO 注册用户
     * @Date 1:22 
     * @Param [use]
     * @return boolean
     **/
    @Override
    public boolean register(User user) {
        if (user.getUsername().isEmpty()||user.getPassword().isEmpty()||
                user.getPasswords().isEmpty()||user.getEmail().isEmpty()||
                user.getPhone().isEmpty()||!user.getPassword().equals(user.getPasswords())){
            return false;
        }

        User save = userRegisterDao.save(user);

        if (save == null){
            return false;
        }

        return true;
    }



    /**
     * @Author chenpeng
     * @Description //TODO 登录
     * @Date 11:59
     * @Param [use]
     * @return boolean
     **/
    @Override
    public boolean login(User user) {
        List<User> login = userRegisterDao.login(user.getUsername(),user.getPassword());
        System.out.println(login.toArray());
        if (login==null){
            return false;
        }

        //写入缓存 先将密码清除
        login.get(0).setPassword("");
        httpSession.setAttribute("loginUser",login.get(0));
        return true;
    }
}
