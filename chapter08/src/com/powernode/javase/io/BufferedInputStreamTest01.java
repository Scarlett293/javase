package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: BufferedInputStreamTest
 * @Date: 2024/4/20 17:33 09
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * java.io.BufferedInputStream的用法和FileInputStream的用法相同
 * 他们
 */
public class BufferedInputStreamTest01 {
    public static void main(String[] args) {
        // 创建节点流
        // try (FileInputStream in = new FileInputStream("file.txt")) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"))) {
            // 创建包装流
            // BufferedInputStream bis = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while((readCount = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, readCount));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
