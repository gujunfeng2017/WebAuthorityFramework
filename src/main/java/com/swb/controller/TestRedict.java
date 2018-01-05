package com.swb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
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
        this.getAllRequestParam(request);
        System.out.println(request.toString()+"KKKKKKKKK==========");
        return "hello";
    }

    @RequestMapping("redirect")
    public String showUserRedirect(HttpServletRequest request){
        System.out.println(request.toString()+"KKKKKKKKK==========");
        this.getAllRequestParam(request);
        return "redirect";
    }

    @RequestMapping("data")
    @ResponseBody
    public Map<String,String> showData(HttpServletRequest request){
        Map<String,String> result111 = new HashMap<String, String>();
        this.getAllRequestParam(request);
        result111.put("result","访问成功");
        return result111;
    }

    public static Map<String, String> getAllRequestParam(final HttpServletRequest request) {
        Map<String, String> res = new HashMap<String, String>();
        Enumeration<?> temp = request.getParameterNames();
        if (null != temp) {

            System.out.println("======================Enumeration<?>temp===================" + temp);
            System.out.println("======================Enumeration<?>temp.toString===================" + temp.toString());
            while (temp.hasMoreElements()) {
                String en = (String) temp.nextElement();
                String value = request.getParameter(en);

                System.out.println("======================en===================" + en);
                System.out.println("======================value====================" + value);

                res.put(en, value);
                if (null == res.get(en) || "".equals(res.get(en))) {
                    res.remove(en);
                }
            }
        } else {
            System.out.println("======================temp is null=================== ");
            System.out.println("======================temp is null=================== ");

        }
        return res;
    }
}
