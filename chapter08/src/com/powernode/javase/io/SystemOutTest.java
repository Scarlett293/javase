package com.powernode.javase.io;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: SystemOutTest
 * @Date: 2024/4/21 18:37 18
 */
public class SystemOutTest {
    public static void main(String[] args) throws Exception {
        PrintStream out = System.out;


        out.println("hello world");
        out.println("hello world");
        out.println("hello world");
        out.println("hello world");
        out.println("hello world");


        // 标准输出流也是可以直接改变输出方向的
        System.setOut(new PrintStream("log"));

        System.out.println("zhangsan");
        System.out.println("lisi");
        System.out.println("wangwu");
        System.out.println("zhaoliu");


        // 获取系统当前时间
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str = sdf.format(now);
        System.out.println(str + ": SystemOutTest's main method invoked!");
    }
}
