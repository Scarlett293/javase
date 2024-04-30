package com.bjpowernode;

import java.util.Scanner;

/**
 * ClassName: Main
 * Decription:
 * Package: com.bjpowernode
 * Date: 2024/4/28 14:30
 * Author: Scalett
 * Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 下载地址
        String url = null;
        if (args == null || args.length == 0) {
            for (; ; ) {
                System.out.println("请输入下载连接");
                Scanner scanner = new Scanner(System.in);
                url = scanner.next();
                if (url != null) {
                    break;
                }
            }
        } else {
            url = args[0];
        }
    }
}
