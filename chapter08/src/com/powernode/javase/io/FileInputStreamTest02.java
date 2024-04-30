package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileInputStreamTest02
 * @Date: 2024/4/20 11:29 29
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/JavaLearn/code/file1.txt");


            // 开始读
            // 提前准备一个byte[] 数组（一次最多读取4个字节。）
            byte[] bytes = new byte[1024];
/*            // 第一次读
            int readCount = fis.read(bytes);
            System.out.println("第一次读取到的字节数量：" + readCount); // 4

            // 将byte数组转换成字符串
            String s1 = new String(bytes, 0, readCount);
            System.out.println(s1);

            // 第二次读
            readCount = fis.read(bytes);
            System.out.println("第一次读取到的字节数量：" + readCount); // 2
            String s2 = new String(bytes, 0, readCount);
            System.out.println(s2);

            // 第三次读
            readCount = fis.read(bytes);
            System.out.println("第一次读取到的字节数量：" + readCount); // -1*/


            // 循环
/*            while(true) {
                int readCount = fis.read(bytes);
                if(readCount == -1) break;
                String s = new String(bytes, 0, readCount);
                System.out.print(s);
            }*/

            // 循环改进
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readCount));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
