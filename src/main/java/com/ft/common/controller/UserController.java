package com.ft.common.controller;

import com.ft.common.pojo.IUser;
import com.ft.common.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cruve on 2017/6/10.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/activeUserList",method = RequestMethod.GET)
    public @ResponseBody List<IUser> findAllActiveUser(){
        return userService.findActiveUsers(1);
    }
}
