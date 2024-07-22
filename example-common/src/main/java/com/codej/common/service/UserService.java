package com.codej.common.service;

import com.codej.common.model.User;

/**
 * 用户服务
 */
public interface UserService {
    /**
     * 获取用户信息
     * @param user
     * @return
     */
    User getUser(User user);
}
