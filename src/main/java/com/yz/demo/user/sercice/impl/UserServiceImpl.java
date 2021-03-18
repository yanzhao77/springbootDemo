package com.yz.demo.user.sercice.impl;

import com.yz.demo.user.dao.UserDao;
import com.yz.demo.user.entity.User;
import com.yz.demo.user.sercice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2021/3/14 09:02
 * @Created by yan34177
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public String deleteById(Integer id) {
        userDao.deleteById(id);
        return "success";
    }
}
