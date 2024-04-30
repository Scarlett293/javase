package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileReaderTest01
 * @Date: 2024/4/20 16:37 19
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件字符输入流。读，以
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("D:\\JavaLearn\\code\\file1.txt")){
            // 开始读
            char[] chars = new char[4];
            int readCount = 0;
            while((readCount = reader.read(chars)) !=  -1) {
                System.out.print(new String(chars, 0, readCount));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
