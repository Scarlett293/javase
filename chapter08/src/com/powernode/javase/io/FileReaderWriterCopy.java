package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileReaderWriterCopy
 * @Date: 2024/4/20 16:45 37
 */

import java.io.*;

/**
 * 使用Reader和Writer拷贝普通文件
 */
public class FileReaderWriterCopy {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("D:\\JavaLearn\\code\\file1.txt");
            FileWriter writer = new FileWriter("D:\\JavaLearn\\code\\file5.txt")) {

            char[] bytes = new char[512];
            int readCount = 0;
            while((readCount = reader.read(bytes)) != -1) {
                writer.write(bytes, 0, readCount);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
