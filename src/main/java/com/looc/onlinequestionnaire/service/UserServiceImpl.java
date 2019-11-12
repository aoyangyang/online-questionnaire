package com.looc.onlinequestionnaire.service;

import com.looc.onlinequestionnaire.bean.Questionnaires;
import com.looc.onlinequestionnaire.bean.User;
import com.looc.onlinequestionnaire.dao.QuestionnairesDao;
import com.looc.onlinequestionnaire.dao.UserRegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    @Autowired
    private QuestionnairesDao questionnairesDao;

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

    /**
     * @Author chenpeng
     * @Description //TODO 添加问卷
     * @Date 11:15 
     * @Param [datas]
     * @return void
     **/
    @Override
    public void userAddQ(String datas,String title) {
        User loginUser = (User) httpSession.getAttribute("loginUser");
        Integer id = loginUser.getId();

        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dfs.format(new Date());

        Questionnaires questionnaires = new Questionnaires();
        questionnaires.setActiveTime(3);
        questionnaires.setCreatedAt(format);
        questionnaires.setDeleteToken(0);
        questionnaires.setProblems(datas);
        questionnaires.setTitle(title);
        questionnaires.setUpdateedAt(format);
        questionnaires.setUsersId(id);

        Questionnaires save = questionnairesDao.save(questionnaires);

        Questionnaires qu = questionnairesDao.getQu(5);


        System.out.println(qu);

    }
}
