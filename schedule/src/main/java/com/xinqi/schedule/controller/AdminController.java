package com.xinqi.schedule.controller;

import com.sun.deploy.net.HttpResponse;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by dell on 2016/8/25.
 */
@Controller
public class AdminController{

    @RequestMapping("/admin/login.do")
    public String index(HttpServletResponse response)throws Exception{
        response.setHeader("Content-Type","text/text");
        response.getWriter().write("Hello");
        response.getWriter().flush();
        return "login";
    }

}
