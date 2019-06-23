package com.looc.onlinequestionnaire.bean;

/**
 * @program online-questionnaire
 * @description:
 * @author: Shanice
 * @create: 2019/06/19 21:43
 */
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private String admin_name;
    private String admin_logintime;
    private String admin_logintimes;
    private String admin_loginip;
    private String admin_addtime;
    private String admin_email;
    private String admin_info;

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

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_logintime() {
        return admin_logintime;
    }

    public void setAdmin_logintime(String admin_logintime) {
        this.admin_logintime = admin_logintime;
    }

    public String getAdmin_logintimes() {
        return admin_logintimes;
    }

    public void setAdmin_logintimes(String admin_logintimes) {
        this.admin_logintimes = admin_logintimes;
    }

    public String getAdmin_loginip() {
        return admin_loginip;
    }

    public void setAdmin_loginip(String admin_loginip) {
        this.admin_loginip = admin_loginip;
    }

    public String getAdmin_addtime() {
        return admin_addtime;
    }

    public void setAdmin_addtime(String admin_addtime) {
        this.admin_addtime = admin_addtime;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public String getAdmin_info() {
        return admin_info;
    }

    public void setAdmin_info(String admin_info) {
        this.admin_info = admin_info;
    }
}
