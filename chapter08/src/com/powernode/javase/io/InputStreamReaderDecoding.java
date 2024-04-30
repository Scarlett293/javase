package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: InputStreamReaderDecoding
 * @Date: 2024/4/21 09:55 19
 */
public class InputStreamReaderDecoding {
    public static void main(String[] args) throws Exception {
        // 创建一个转换流对象（输入流）

        // 节点流
        // FileInputStream in = new FileInputStream("");

        // 包装流
        // InputStreamReader isr = new InputStreamReader(in);



        InputStreamReader isr = new InputStreamReader(new FileInputStream("file.txt"),  StandardCharsets.UTF_8);

        //
        FileReader reader = new FileReader("file.txt", Charset.forName("UTF-8"));

        // 开始读
        int readCount = 0;
        char[] chars = new char[1024];
        while((readCount = reader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, readCount));
        }


        isr.close();


    }
}
