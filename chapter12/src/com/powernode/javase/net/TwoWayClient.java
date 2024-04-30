package com.powernode.javase.net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * ClassName: TwoWayClient
 * Decription:
 * 发送一个图片给服务器
 * 接收服务器返回的消息
 * Package: com.powernode.javase.net
 * Date: 2024/4/26 12:07
 * Author: Scalett
 * Version: 1.0
 */
public class TwoWayClient {
    public static void main(String[] args) {
        // 创建客户端套接字对象
        Socket clientSocket = null;
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        BufferedReader br = null;
        try {
            clientSocket = new Socket(InetAddress.getLocalHost(), 8888);


            // 发送一张图片给服务器
            bos = new BufferedOutputStream(clientSocket.getOutputStream());


            // 写图片
            // 一边读一边写
            bis = new BufferedInputStream(new FileInputStream("d:/dog.jpg"));

            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readCount);
            }
            bos.flush();

            // 关闭输出（输出结束）
            clientSocket.shutdownOutput();


            br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String s = null;
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
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
            if (bos != null) {
                try {
                    bos.close();
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
