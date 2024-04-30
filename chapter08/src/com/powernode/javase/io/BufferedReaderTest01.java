package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: BufferedReaderTest01
 * @Date: 2024/4/20 18:02 13
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 带有缓冲区的字符输入流
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception {
        // 创建带有缓冲区的字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // BufferedWriter bw = new BufferedWriter(new FileWriter(""));

        // 开始读
        String s = null;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        //

        br.close();
    }
}
