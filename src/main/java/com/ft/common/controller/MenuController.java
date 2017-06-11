package com.ft.common.controller;

import com.ft.common.pojo.TMenu;
import com.ft.common.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by poseture on 2017/6/11.
 */

@Controller(value = "/menu")
public class MenuController {

    @Resource
    private MenuService menuService;

    @RequestMapping(value = "/parentMenu",method = RequestMethod.GET)
    public @ResponseBody List<TMenu> findParentMenu(HttpServletRequest request, HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问


        return menuService.findParentMenu();
    }

}
