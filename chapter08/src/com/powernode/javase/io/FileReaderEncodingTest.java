package com.powernode.javase.io;

import java.io.FileReader;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileReaderEncodingTest
 * @Date: 2024/4/20 18:34 16
 */
public class FileReaderEncodingTest {
    public static void main(String[] args) throws Exception {
        // 创建FileReader的时候，没有指定字符集，默认采用UTF-8的字符集进行解码
        FileReader reader = new FileReader("file.txt");

        int readCount = 0;
        char[] chars = new char[1024];
        while((readCount = reader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, readCount));
        }
        reader.close();
    }
}
