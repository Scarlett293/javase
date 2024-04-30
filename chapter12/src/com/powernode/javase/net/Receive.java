package com.powernode.javase.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ClassName: Receive
 * Decription:
 * Package: com.powernode.javase.net
 * Date: 2024/4/26 12:48
 * Author: Scalett
 * Version: 1.0
 */
public class Receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(8888);

        byte[] bytes = new byte[64 * 1024];
        // 准备一个包，这个包接收发送方的信息。
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        // 程序执行到这里，停下来，等待发送方的发送。
        ds.receive(dp);

        // 程序执行到这里说明，已经完全将发送方发送的数据接收到了。
        // 从包中取出来数据
        String msg = new String(bytes, 0, dp.getLength());
        System.out.println("接收到的发送方发过来的消息：" + msg);



        ds.close();
    }
}
