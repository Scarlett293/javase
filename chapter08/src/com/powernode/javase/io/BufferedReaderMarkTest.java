package com.powernode.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: BufferedReaderMarkTest
 * @Date: 2024/4/20 18:24 34
 */
public class BufferedReaderMarkTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        // 开始读
        System.out.println(br.read());
        System.out.println(br.read());
        System.out.println(br.read());

        br.mark(3);

        System.out.println(br.read());
        System.out.println(br.read());
        br.reset();
        System.out.println(br.read());
        System.out.println(br.read());


        br.close();
    }
}
