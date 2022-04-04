package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : TangHao
 * @description : 用户
 * @ClassName :User
 * @createTime : 2022/3/14 10:12
 * @updateTime : 2022/3/14 10:12
 * @updateRemark : [说明本次修改内容]
 */
public class User {
    /**
     * id
     */
    @Autowired
    private Integer Id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;


    /**
     * 权限
     */


    private Integer authority;

    public User() {
    }

    public User(Integer id, String name, String password, Integer authority) {
        Id = id;
        this.name = name;
        this.password = password;
        this.authority = authority;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                '}';
    }
}
