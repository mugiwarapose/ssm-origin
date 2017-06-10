package com.ft.common;

import com.alibaba.fastjson.JSON;
import com.ft.common.pojo.IUser;
import com.ft.common.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cruve on 2017/6/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)             //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private UserService userService;

    @Test
    public void st1() {
       List<IUser> user =userService.findActiveUsers(1);
        //System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }

}
