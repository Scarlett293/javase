package com.powernode.javase.io;

import java.io.ByteArrayOutputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ByteArrayOutputStreamTest01
 * @Date: 2024/4/21 23:31 56
 */
public class ByteArrayOutputStreamTest01 {
    public static void main(String[] args) {
        // ByteArrayOutputStream的基本用法
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // 节点流


        // 开始写
        baos.write(1);
        baos.write(2);
        baos.write(3);

        // 怎么获取内存中的那个byte[]数组呢？
        byte[] byteArray = baos.toByteArray();
        for (byte b : byteArray) {
            System.out.println(b);
        }
    }
}
