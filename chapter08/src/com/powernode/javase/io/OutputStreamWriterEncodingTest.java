package com.powernode.javase.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: OutputStreamWriterEncodingTest
 * @Date: 2024/4/21 10:32 13
 */
public class OutputStreamWriterEncodingTest {
    public static void main(String[] args) throws Exception {
        // OutputStreamWriter osw = new OutputStreamWriter(
        //        new FileOutputStream("file.txt"), "UTF-8");


        FileWriter osw = new FileWriter("file.txt", Charset.forName("GBK"), true);

        osw.write("来动力节点学Java");

        osw.flush();
        osw.close();
    }
}
