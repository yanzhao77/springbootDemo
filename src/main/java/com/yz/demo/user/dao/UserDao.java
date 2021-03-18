package com.yz.demo.user.dao;

import com.yz.demo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Classname UserDao
 * @Description TODO
 * @Date 2021/3/14 09:03
 * @Created by yan34177
 */
@Mapper
public interface UserDao {
    List<User> getAll(@Param("content") Map map);

    String deleteById(@Param("content")Integer id);
}
