package com.powernode.javase.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: Send
 * Decription:
 * Package: com.powernode.javase.net
 * Date: 2024/4/26 12:48
 * Author: Scalett
 * Version: 1.0
 */
public class Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();


        // 创建包
        byte[] bytes = "动力节点".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 8888);
        // 发送消息
        ds.send(dp);

        ds.close();
    }
}
