package com.yz.demo.user.sercice;

import com.yz.demo.user.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Classname UserService
 * @Description TODO
 * @Date 2021/3/14 09:02
 * @Created by yan34177
 */
public interface UserService {
    List<User> getAll(Map map);

    String deleteById(Integer id);
}
