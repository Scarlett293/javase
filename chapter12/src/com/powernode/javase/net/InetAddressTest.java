package com.powernode.javase.net;

import java.net.InetAddress;

/**
 * ClassName: InetAddressTest
 * Decription:
 * Package: com.powernode.javase.net
 * Date: 2024/4/25 18:11
 * Author: Scalett
 * Version: 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        InetAddress ia = InetAddress.getLocalHost();

        String hostAddress = ia.getHostAddress();
        System.out.println("本机IP地址：" + hostAddress);

        String hostName = ia.getHostName();
        System.out.println("本机的主机名：" + hostName);


        InetAddress ia2 = InetAddress.getByName("www.baidu.com");




        System.out.println(ia2.getHostAddress());
        System.out.println(ia2.getHostName());

    }
}
