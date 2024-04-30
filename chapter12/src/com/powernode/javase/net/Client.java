package com.powernode.javase.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * ClassName: Client
 * Decription:
 * 现在使用Java中的Socket实现单向通信，基于TCP协议。属于TCP编程
 * 这个类是客户端
 * Package: com.powernode.javase.net
 * Date: 2024/4/25 22:25
 * Author: Scalett
 * Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建客户端套接字对象
        // 需要指定IP和端口号
        Socket clientSocket = null;
        BufferedWriter bw = null;

        try {
            InetAddress ia = InetAddress.getLocalHost();
            int port = 8888;
            clientSocket = new Socket(ia, port);

            // 客户端给服务端发消息
            // 服务器端接收消息，所以服务端应该获取输入流。
            bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));


            // 发送消息
/*            while(true) {
                bw.write("你好，最近身体怎么样啊？");
                bw.write("\n");
                bw.write("你收到消息了么？");

                bw.flush();

                Thread.sleep(1000);
            }*/

            Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.println("请输入您要发送的信息：");
                String msg = scanner.next();
                bw.write(msg);
                bw.write("\n");

                bw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (clientSocket != null) {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
