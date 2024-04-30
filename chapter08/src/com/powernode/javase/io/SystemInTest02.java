package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: SystemInTest02
 * @Date: 2024/4/21 14:06 30
 */
public class SystemInTest02 {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("log2"));

        InputStream in = System.in;

        byte[] bytes = new byte[1024];
        int readCount = 0;
        while((readCount = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readCount));
        }
    }
}
