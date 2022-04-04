package com.ctbu.controller;

import com.ctbu.entity.User;
import com.ctbu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :UserController
 * @createTime : 2022/3/14 15:00
 * @updateTime : 2022/3/14 15:00
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(String userName, String password){
        User user=new User();
        user.setName(userName);
        user.setPassword(password);
        User user1 = userService.loginService(user);
        Map<String,Object> map=new HashMap<String, Object>();
        if(user1!=null){
            map.put("msg","登录成功");
            map.put("statu",1);
            map.put("user",user1);
        }else {
            map.put("msg","登录失败");
            map.put("statu",0);
        }
        return map;
    }
    @RequestMapping("/listUsers")
    @ResponseBody
    public List<User> getUserList() {
        List<User> users=userService.getUserList();
        System.out.println(users);
        return users;
    }
}
