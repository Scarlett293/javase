package com.powernode.javase.io;

import java.io.FileWriter;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileWriterEncodingTest
 * @Date: 2024/4/20 18:41 48
 */
public class FileWriterEncodingTest {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("file.txt", true);

        writer.write("动力节点");

        writer.flush();

        writer.close();
    }
}
