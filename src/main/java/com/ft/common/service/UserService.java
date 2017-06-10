package com.ft.common.service;

import com.ft.common.dao.UserDao;
import com.ft.common.pojo.IUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cruve on 2017/6/10.
 */
@Service("userService")
public class UserService {

    @Resource
    private UserDao userDao;

    public List<IUser> findActiveUsers(Integer active){
        return userDao.findActiveUser(active);
    }
}
