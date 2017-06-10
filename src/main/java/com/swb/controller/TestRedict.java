package com.swb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by programmer.aj on 2017/6/10.
 */
@Controller
@RequestMapping("/testRelay")
public class TestRedict{

    @RequestMapping("query")
    public String showUser(HttpServletRequest request){
        System.out.println(request.toString()+"KKKKKKKKK==========");
        return "/hello";
    }


}
