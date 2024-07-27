package com.codej.consumer;

import com.codej.common.model.User;
import com.codej.common.service.UserService;
import com.codej.proxy.ServiceProxyFactory;

public class ConsumerExample {
    public static void main(String[] args) {
        //静态代理
        //UserService userService = new UserServiceProxy();
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("rose");
        User newUser = userService.getUser(user);
        if (newUser != null){
            System.out.println(newUser.getName());
        }else {
            System.out.println("user == null");
        }
    }
}
