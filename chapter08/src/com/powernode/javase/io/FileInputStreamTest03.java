package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileInputStreamTest03
 * @Date: 2024/4/20 15:33 38
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/JavaLearn/code/file1.txt");

/*            byte[] bytes = new byte[10];
            int readCount = fis.read(bytes, 2, 5);
            System.out.println("读取到了多少个字节：" + readCount);

            for (byte b : bytes) {
                System.out.println(b);
            }
            */

/*
            int readByte = fis.read();
            System.out.println(readByte);

            // 跳过两个
            fis.skip(2);

            readByte = fis.read();
            System.out.println(readByte); // 100

            System.out.println("还剩几个字节没有读取？ " + fis.available());*/

            byte[] bytes = new byte[fis.available()];
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes, 0, readCount));


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
