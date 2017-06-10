package com.ft.common.dao;

import com.ft.common.pojo.IUser;

import java.util.List;

/**
 * Created by cruve on 2017/6/10.
 */
public interface UserDao {

    List<IUser> findActiveUser(Integer active);

    List<IUser> findAlUser();

}
