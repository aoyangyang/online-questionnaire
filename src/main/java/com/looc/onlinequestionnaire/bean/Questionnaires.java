package com.looc.onlinequestionnaire.bean;

import javax.persistence.*;

/**
 * @author chenPeng
 * @version 1.0.0
 * @ClassName Questionnaires.java
 * @Description TODO
 * @createTime 2019年06月23日 11:03:00
 */
@Entity
@Table(name = "questionnaires")
public class Questionnaires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer usersId;
    @Column
    private String title;
    @Column
    private Integer activeTime;
    @Column
    private Integer deleteToken;
    @Column
    private String createdAt;
    @Column
    private String updateedAt;
    @Column
    private String problems;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Integer activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getDeleteToken() {
        return deleteToken;
    }

    public void setDeleteToken(Integer deleteToken) {
        this.deleteToken = deleteToken;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateedAt() {
        return updateedAt;
    }

    public void setUpdateedAt(String updateedAt) {
        this.updateedAt = updateedAt;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }
}
