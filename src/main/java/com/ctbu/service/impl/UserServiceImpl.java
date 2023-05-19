package com.ctbu.service.impl;
import com.ctbu.entity.User;
import com.ctbu.mapper.UserMapper;
import com.ctbu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :UserServiceImpl
 * @createTime : 2022/3/14 14:58
 * @updateTime : 2022/3/14 14:58
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param user
     * @return
     */
    public User loginService(User user) {
        return userMapper.login(user);
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
