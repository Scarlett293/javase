package com.powernode.javase;

/**
 * time :2024/4/13 18:51 35
 * ClassName :Exception08
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 放在finally语句块中的代码是一定会执行的，通常在finally代码块中完成资源的释放
 * 因为资源的释放是必须要执行的，为了保证资源一定能释放，建议写到finally语句块中
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        /* try {
            String s = null;
            s.toString();

            // 关闭资源
            // System.out.println("关闭资源");
        } finally {
            System.out.println("关闭资源");
            System.out.println("finally 语句块执行了");
        } */

        // IO操作，通过学习了IO流你就能看懂了
        FileInputStream in = null;
        try {
            in = new FileInputStream("D:\\JavaLearn\\code\\javase\\ExceptionTest08.java");

            // 开始读
            byte[] bytes = new byte[1024]; // 一次读取1kb
            int readCount = 0;
            while((readCount = in.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readCount));
            }

            // 关闭资源
            // in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("main over");
    }
}
