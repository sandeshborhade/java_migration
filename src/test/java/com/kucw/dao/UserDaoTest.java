package com.kucw.dao;

import com.kucw.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootTest
@Transactional
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setName("test Boss");
        user.setUpdateTime(new Date());
        userDao.insertUser(user);
    }

    @Test
    public void getUserById() throws Exception {
        User user = userDao.getUserById(1);
        System.out.println(user.getName());
        Assertions.assertNotNull(user);
    }

    @Test
    public void getUserById4() throws Exception {
        User user = userDao.getUserById(4);
        System.out.println(user.getName());
        Assertions.assertNotNull(user);
    }
}