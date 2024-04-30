package com.powernode.javase.net;

import java.net.URL;

/**
 * ClassName: URLTest01
 * Decription:
 * Package: com.powernode.javase.net
 * Date: 2024/4/25 18:26
 * Author: Scalett
 * Version: 1.0
 */
public class URLTest01 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.baidu.com:888/oa/index.html?name=zhangsan&password=123#tip");

        // 获取URL中的信息
        String protocol = url.getProtocol();
        System.out.println("协议：" + protocol);


        // 获取资源路径
        String path = url.getPath();
        System.out.println(path);

        // HTTP协议的默认端口是80
        int defaultPort = url.getDefaultPort();
        System.out.println("默认端口号：" + defaultPort); // 443

        int port = url.getPort();
        System.out.println("当前端口：" + port);


        String host = url.getHost();
        System.out.println(host);

        String query = url.getQuery();
        System.out.println(query);

        String ref = url.getRef();
        System.out.println(ref);
    }
}
