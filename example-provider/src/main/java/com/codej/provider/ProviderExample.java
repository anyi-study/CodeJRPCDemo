package com.codej.provider;

import com.codej.common.service.UserService;
import com.codej.provider.service.impl.UserServiceImpl;
import com.codej.registry.LocalRegistry;
import com.codej.server.HttpServer;
import com.codej.server.VertxHttpServer;

/**
 * 提供者示例
 */
public class ProviderExample {
    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
//        提供服务，启动web服务器
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
