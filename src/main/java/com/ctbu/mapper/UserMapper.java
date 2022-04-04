package com.ctbu.mapper;

import com.ctbu.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :UserMapper
 * @createTime : 2022/3/14 10:18
 */

public interface UserMapper {
    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getUserList();
}
