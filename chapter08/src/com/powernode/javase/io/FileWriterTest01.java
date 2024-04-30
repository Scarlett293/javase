package com.powernode.javase.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileWriterTest01
 * @Date: 2024/4/20 16:53 54
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("D:\\JavaLearn\\code\\file6.txt")) {
            // 开始写
            writer.write("hello world!");
            writer.append("\n");
            writer.write("张三李四王五赵六", 2, 2);
            writer.append("\n");
            writer.write("张三李四王五".toCharArray());
            writer.append("\n");
            writer.write("张三李四王五".toCharArray(), 2, 2);
            writer.append("\n");

            writer.append("a");
            writer.append("b");
            writer.append("c");
            writer.append("d");

            // 建议手动刷新
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
