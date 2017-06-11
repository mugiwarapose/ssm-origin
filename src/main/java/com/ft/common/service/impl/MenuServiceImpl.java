package com.ft.common.service.impl;

import com.ft.common.dao.MenuDao;
import com.ft.common.pojo.TMenu;
import com.ft.common.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by poseture on 2017/6/11.
 */

@Service(value = "menuService")
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuDao menuDao;

    public List<TMenu> findParentMenu() {

        List<TMenu> data = menuDao.finaParentMenu();
        System.out.println(data);
        return data;
    }

    public TMenu finaMenuById(Integer menuId) {
        return null;
    }
}
