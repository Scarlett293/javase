package com.powernode.javase.io;

import java.io.PrintStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: PrintStreamTest
 * @Date: 2024/4/21 12:25 13
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("log");


        ps.print(100);
        ps.println(false);
        ps.println("abc");
        ps.println('T');
        ps.println("hello world");
        ps.print(200);

        ps.println("\"helloworld\"");

        String name = "张三";
        double score = 95.5;
        ps.printf("姓名：%s，考试成绩：%.2f", name, score);
        //
        ps.close();
    }
}
