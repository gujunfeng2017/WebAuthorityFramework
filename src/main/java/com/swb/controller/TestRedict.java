package com.swb.controller;

import org.springframework.http.MediaType;
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

    @RequestMapping(value = "dataTest",produces="application/json;charset=UTF-8")
    @ResponseBody
    public  String showData(){

        String testReturn =  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<root xmlns=\"namespace_string\"><MsgHeader><SndDt>2017-11-22T15:51:44</SndDt><MsgTp>epcc.303.001.01</MsgTp><IssrId>Z2017112000011</IssrId><Drctn>11</Drctn><SignSN>4054344069</SignSN></MsgHeader><MsgBody><SysRtnInf><SysRtnCd>00000000</SysRtnCd><SysRtnDesc>接收成功</SysRtnDesc><SysRtnTm>2017-11-22T15:51:44</SysRtnTm></SysRtnInf></MsgBody></root>\n{S:heccx2aBERiru3wP0Yc9twv9KA6EBWhbKG1ezcQ7h/r+jRBh0HvLz11rQyGe8My0dlMtI4PneXkprD9sWZqOmTheMM/bm0SdrRiYFGFTXt7uiyMcfN77g8dAUy9RwPyqzilCZmtVQGugKj1ZEuGyMboDj78wqQOOc+PwQXuL5bBeiJbWzbRd0fafKUIv66qjeKKDkt/iOhDQMLRwxv461PgOnuqy5FbGLVRuAljl+CzOSMKwmXAO3egFKuYH/JejRlRRMA+TdAR3YSyDoIBfNZW3+crAazDIUehTs1CA2EpzcoNUTG2oa6lEDrITvLGKU5l47Y+Sz6/RQFykkl7Wiw==}";
        System.out.println(testReturn);
        return testReturn;
    }
}
