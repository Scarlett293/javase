package com.powernode.javase.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: Server
 * Decription:
 * 现在使用Java中的Socket实现单向通信，基于TCP协议。属于TCP编程
 * 这个类是服务端
 * Package: com.powernode.javase.net
 * Date: 2024/4/25 22:25
 * Author: Scalett
 * Version: 1.0
 */
public class Server {
    public static void main(String[] args) {
        // 启动服务器端，这个应用肯定要对应一个端口
        // 创建服务器端套接字对象
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader br = null;
        try {
            int port = 8888;
            serverSocket = new ServerSocket(port);

            System.out.println("服务器正在启动，请稍后...");
            System.out.println("服务器启动成功，端口号：" + port + "，等待客户端的请求!");

            // 开始接收客户端的请求
            clientSocket = serverSocket.accept();

            // 后续代码怎么写
            // clientSocket.getInputStream()
            br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            while(true) {
                String s = null;
                while((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭服务端套接字
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(clientSocket != null) {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
