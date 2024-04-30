package com.powernode.javase.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TwoWayServer
 * Decription:
 * 接收客户端发过来的图片
 * 回复消息给客户端
 * Package: com.powernode.javase.net
 * Date: 2024/4/26 12:08
 * Author: Scalett
 * Version: 1.0
 */
public class TwoWayServer {
    public static void main(String[] args) {
        //
        ServerSocket serverSocket = null;
        BufferedInputStream bis = null;
        Socket clientSocket = null;
        BufferedOutputStream bos = null;
        BufferedWriter bw = null;

        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("服务器启动成功，正在接收客户端的请求!");

            // 开始接收客户端的请求
            clientSocket = serverSocket.accept();

            // 读
            bis = new BufferedInputStream(clientSocket.getInputStream());

            // 创建输入流
            bos = new BufferedOutputStream(new FileOutputStream("./dog.jpg"));

            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = bis.read(bytes)) != -1) {
                // 将图片写入到本地硬盘上
                bos.write(bytes, 0, readCount);
            }
            bos.flush();

            // 服务器接受完图片之后，给客户端回个话
            bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            bw.write("你发的图片我已经收到了! \n");

            bw.flush();


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
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bis != null) {
                try {
                    bis.close();
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
