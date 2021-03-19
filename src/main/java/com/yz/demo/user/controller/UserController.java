package com.yz.demo.user.controller;

import com.yz.demo.user.entity.User;
import com.yz.demo.user.sercice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Classname UserController
 * @Description TODO
 * @Date 2021/3/14 09:00
 * @Created by yan34177
 */
//ResponseBoy + Controller
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }

    @ResponseBody
    @RequestMapping("/getAll")
    public List<User> getAll(Map map) {
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        return "redirect:/index.html";
    }
}
