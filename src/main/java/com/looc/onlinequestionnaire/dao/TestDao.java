package com.looc.onlinequestionnaire.dao;

import com.looc.onlinequestionnaire.bean.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program online-questionnaire
 * @description:
 * @author: Shanice
 * @create: 2019/06/19 21:46
 */
@Mapper
public interface TestDao {

    @Select("Select * from admin")
    List<Admin> getAllAdmin();
}
