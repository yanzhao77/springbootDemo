package com.yz.demo.user.entity;


import java.util.Date;

/**
 * @version 1.0
 * @Classname User
 * @Description TODO
 * @Date 2021/3/14 09:03
 * @Created by yan34177
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer stratus;
    private Date createTime;

    public User(Integer id, String userName, String password, Integer stratus, Date createTime) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.stratus = stratus;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStratus() {
        return stratus;
    }

    public void setStratus(Integer stratus) {
        this.stratus = stratus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", stratus=" + stratus +
                ", createTime=" + createTime +
                '}';
    }
}
