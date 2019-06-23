package com.looc.onlinequestionnaire.dao;

import com.looc.onlinequestionnaire.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName UserRegisterDao.java
 * @Description TODO user为表，Integer为主键,继承JpaRepository来完成对数据库的操作
 * https://www.cnblogs.com/litblank/p/8267333.html
 * @createTime 2019年06月22日 01:27:00
 */
public interface UserRegisterDao extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
    /**
     * @Author chenpeng
     * @Description //TODO 登录
     * @Date 1:53 
     * @Param [username, password]
     * @return com.looc.onlinequestionnaire.bean.User
     **/
    @Query(value = "select u.* from users u where u.username=?1 and u.password=?2",nativeQuery = true)
    List<User> login(String username, String password);
}
