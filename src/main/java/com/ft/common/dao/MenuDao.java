package com.ft.common.dao;

import com.ft.common.pojo.TMenu;

import java.util.List;

/**
 * Created by poseture on 2017/6/11.
 */
public interface MenuDao {

    List<TMenu> finaParentMenu();

    TMenu findMenuById(int menu);

    List<TMenu> findAllMenu();
}
