package com.swb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by programmer.aj on 2017/6/10.
 */
@Controller
@RequestMapping("/testRelay")
public class TestRedict{

    @RequestMapping("query")
    public String showUser(HttpServletRequest request){
        System.out.println(request.toString()+"KKKKKKKKK==========");
        return "hello";
    }

    @RequestMapping("data")
    @ResponseBody
    public Map<String,String> showData(HttpServletRequest request){
        Map<String,String> result111 = new HashMap<String, String>();
        result111.put("result","访问成功");
        return result111;
    }

}
