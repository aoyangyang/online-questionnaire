package com.looc.onlinequestionnaire.web;

import com.looc.onlinequestionnaire.bean.Admin;
import com.looc.onlinequestionnaire.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

/**
 * @program online-questionnaire
 * @description:
 * @author: Shanice
 * @create: 2019/06/19 13:17
 */
@Controller
public class Test {

    @Autowired
    private TestDao testDao;


    /*//提交什么东西
    @PostMapping("/test")

    //添加某个东西
    @PutMapping("/test")

    //删除某个东西
    @DeleteMapping("/test")*/

    //请求什么东西
    @GetMapping("/test")
    public String test(Model model){
       //往前台存东西存东西哦
        System.out.println("teststetse");
        model.addAttribute("hello","nihao");
        //取东西
        List<Admin> allAdmin = testDao.getAllAdmin();



        return "aaa/hello";
    }
}
