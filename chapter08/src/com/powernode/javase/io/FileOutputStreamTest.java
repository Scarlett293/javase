package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileOutputStreamTest
 * @Date: 2024/4/20 15:42 01
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FileOutputStream
 *      1. 文件字节输出流，负责写
 *      2. 常用构造方法：
 *          FileOutputStream(String name)
 *              创建一个文字字节输出流对象，这个流在使用的时候，最开始会将源文件内容全部清空，然后写入
 *          FileOutputStream(String name, boolean append)
 *              创建一个文字字节输出流对象，当append是true的时候，不会清空源文件的内容，在源文件的末尾追加写入
 *              创建一个文字字节输出流对象，当append是false的时候，会清空源文件的内容，然后写入。
 *
 *              注意：append==true表示：不会清空原文件内容，在原文件内容后面追加
 *              append==false表示：清空原文件内容，在文件中写入。
 *      3. 常用方法：
 *          void close();
 *          void flush();
 *          void write(int b); 写一个字节
 *          void write(byte[] b); 将整个byte字节数组写出
 *          void write(byte[], int off, int len); 将byte字节数组的一部分写出。
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        // 创建文件字节输出流对象
        FileOutputStream out = null;
        try {

            // 以下两行代码一样
            //out = new FileOutputStream("D:/JavaLearn/code/file2.txt");
            //out = new FileOutputStream("D:/JavaLearn/code/file2.txt", false);
            out = new FileOutputStream("D:/JavaLearn/code/file2.txt");

            // 开始写
/*            out.write(97);
            out.write(98);
            out.write(99);
            out.write(100);*/

            byte[] bytes = {97, 98, 99, 100};
            out.write(bytes);
            out.write(bytes, 0, 2);


            byte[] bytes1 = "动力结点，一家只教授Java的培训机构".getBytes();
            out.write(bytes1);

            // 记得刷新
            out.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭资源
            if(null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
