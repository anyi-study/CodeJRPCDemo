package com.codej.provider.service.impl;

import com.codej.common.model.User;
import com.codej.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名："+user.getName());
        return user;
    }
}
