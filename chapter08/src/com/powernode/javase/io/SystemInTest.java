package com.powernode.javase.io;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: SystemInTest
 * @Date: 2024/4/21 13:59 14
 */
public class SystemInTest {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;

        byte[] bytes = new byte[1024];
        int readCount = in.read(bytes);

        for (int i = 0; i < readCount; i++) {
            System.out.println(bytes[i]);
        }

    }
}
