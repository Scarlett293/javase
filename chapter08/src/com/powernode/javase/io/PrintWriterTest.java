package com.powernode.javase.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: PrintWriterTest
 * @Date: 2024/4/21 13:55 42
 */
public class PrintWriterTest {
    public static void main(String[] args) throws Exception {
        // 创建字符打印流
        PrintWriter pw = new PrintWriter(new FileWriter("log2"));

        pw.println("hello world");
        pw.println("hello zhangsan");

        pw.flush();

        pw.close();


    }
}
