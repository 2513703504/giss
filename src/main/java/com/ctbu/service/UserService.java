package com.ctbu.service;

import com.ctbu.entity.User;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :UserService
 * @createTime : 2022/3/14 14:59
 */
public interface UserService {
    /**
     * 登录
     * @param user
     * @return
     */
    User loginService(User user);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getUserList();
}
