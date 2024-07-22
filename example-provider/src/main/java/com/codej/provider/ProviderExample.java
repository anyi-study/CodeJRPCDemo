package com.codej.provider;

import com.codej.server.HttpServer;
import com.codej.server.VertxHttpServer;

/**
 * 提供者示例
 */
public class ProviderExample {
    public static void main(String[] args) {
//        提供服务，启动web服务器
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
