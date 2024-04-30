package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: AboutFilePath
 * @Date: 2024/4/20 16:59 37
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 关于IO流中读写文件时，文件的路径问题
 */
public class AboutFilePath {
    // 到目前为止，我们读写文件时，路径统一采用的都是绝对路径
    // FileInputStream in = new FileInputStream("D:\\JavaLearn\\code\\file1.txt");
    // FileInputStream in = new FileInputStream("D:/JavaLearn/code/file1.txt");

    // 我们尝试使用相对路径
    // 相对路径一定要搞清楚当前路径是哪里？相对路径一定是从当前所在的路径开始。
    // 在IDEA工具中，默认的当前路径是project的根。（项目的根就是当前路径）
    public static void main(String[] args) throws FileNotFoundException {

        // FileInputStream in = new FileInputStream("log");

        // FileInputStream in = new FileInputStream("chapter08/src/log2");

        // 新的内容
        // 以下讲解内容有一些代码是和线程有关系的，大致理解一下。
        // 或者说这个代码死记硬背也是可以的
        // 从类路径当中加载资源。
        // Thread.currentThread() 获取当前线程
        // Thread.currentThread().getContextClassLoader() 获取当前线程的类加载器
        // getResource()方法就表示从类的根路径开始加载资源
        // Thread.currentThread() 获取当前线程
        // Thread.currentThread().getContextClassLoader() 获取当前线程的类加载器
        // getResource() 方法就表示从类的根路径下开始加载资源
        // 注意：这种方式只能从类路径当中加载资源，如果这个资源是放在类路径之外的，这种方式不合适
        // 如果
        String path = Thread.currentThread().getContextClassLoader().getResource("log").getPath();
        System.out.println(path);

        FileInputStream in = new FileInputStream(path);
    }
}
