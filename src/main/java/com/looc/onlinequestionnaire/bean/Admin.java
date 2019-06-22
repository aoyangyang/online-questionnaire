package com.looc.onlinequestionnaire.bean;

/**
 * @program online-questionnaire
 * @description:
 * @author: Shanice  这个是一个测试
 * @create: 2019/06/19 21:43
 */
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private String tMsg;

    public String gettMsg() {
        return tMsg;
    }

    public void settMsg(String tMsg) {
        this.tMsg = tMsg;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
