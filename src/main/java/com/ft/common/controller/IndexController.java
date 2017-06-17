package com.ft.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pose on 2017/6/11.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    public String index(){

        return "index";
    }

}
