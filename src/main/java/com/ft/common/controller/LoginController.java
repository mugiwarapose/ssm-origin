package com.ft.common.controller;

import com.ft.common.pojo.IUser;
import com.ft.common.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by pose on 2017/6/12.
 */
@Controller
public class LoginController  {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginPage(HttpServletRequest req,HttpServletResponse resp,@RequestBody  UserVo userVo){
        resp.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(userVo.toString()+"GET");
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody String login (HttpServletRequest req, HttpServletResponse resp,@RequestBody  UserVo userVo) throws UnsupportedEncodingException {

        resp.setHeader("Access-Control-Allow-Origin", "*");
       Map<String,String[]> maps = req.getParameterMap();

        Enumeration  eums = req.getParameterNames();

        while(eums.hasMoreElements()){
            System.out.println("parameterName:"+eums.nextElement());
        }

        System.out.println(userVo.toString());

        return "login";
    }
}
