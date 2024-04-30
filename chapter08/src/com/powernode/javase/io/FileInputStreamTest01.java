package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileInputStreamTest01
 * @Date: 2024/4/20 11:12 42
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * java.io.FileInputStream
 *      1. 称为文件字节输入流，负责读
 *      2. 是一个万能流，任何文件都能去。但还是建议读二进制文件。例如：图片、声音、视频等。
 *      3. 但是FileInputStream肯定也是可以读普通文本的，只不过一次读取一个字节。容易出现乱码问题。
 *      4. FileInputStream的常用构造方法
 *          FileInputStream(String name) 通过文件路径构建一个文件字节输入流对象
 *      5. FileInputStream的常用方法
 *          int read(); 调用一次read()方法，则读取一个字节，如果读不到任何数据则返回-1
 *          int read(byte[] b); 一次最多可以读到b.length个字节。（只要文件内容足够多）。如果这一次没有读取到任何数据，则返回-1
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            // 创建一个文件字节输入流
            // in = new FileInputStream("D:\\JavaLearn\\code\\file1.txt"); // 注意：这种写法需要两个反斜杠
            in = new FileInputStream("D:/JavaLearn/code/file1.txt"); // 当然，也可以使用1个正斜杠

            // int read = in.read();
            // System.out.println("第1次读到的字节：" + read);

/*            read = in.read();
            System.out.println("第2次读到的字节：" + read);
            read = in.read();
            System.out.println("第3次读到的字节：" + read);
            read = in.read();
            System.out.println("第4次读到的字节：" + read);
            read = in.read();
            System.out.println("第5次读到的字节：" + read);
            read = in.read();
            System.out.println("第6次读到的字节：" + read);
            read = in.read();
            System.out.println("第7次读到的字节：" + read);*/

            // 第一次使用循环改进
/*            while(true) {
                int readByte = in.read();
                if(readByte == -1) break;
                System.out.println(readByte);
            }*/

            // 改进while循环
            int readByte;
            while((readByte = in.read()) != -1) {
                System.out.println(readByte);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != in) {
                // 处理异常
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
