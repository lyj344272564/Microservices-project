package com.lagou.eduuserboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lagou.eduuserboot.mapper.UserMapper;
import com.lagou.eduuserboot.pojo.User;
import com.lagou.eduuserboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String phone, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq("phone",phone);
        queryWrapper.eq("password",password);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public Integer checkPhone(String phone) {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq("phone",phone);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            return 0;
        }
        return 1;
    }

    @Override
    public Integer register(String phone, String password, String nickname, String headimg) {
        User user = new User();
        user.setPhone(phone);
        user.setPassword(password);
        user.setName(nickname);
        user.setPortrait(headimg);
        int i = userMapper.insert(user);
        return i;
    }
}
