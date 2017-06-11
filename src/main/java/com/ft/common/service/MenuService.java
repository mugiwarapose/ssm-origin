package com.ft.common.service;

import com.ft.common.pojo.TMenu;

import java.util.List;

/**
 * Created by poseture on 2017/6/11.
 */
public interface MenuService {

    public List<TMenu> findParentMenu();

    public TMenu finaMenuById(Integer menuId);



}
