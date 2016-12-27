package com.xinqi.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dell on 2016/8/25.
 */
@Controller
public class AdminController{

    @RequestMapping("/admin/login.do")
    public String index(){
        System.out.println(Math.random());
        return "a";
    }
}
