package com.powernode.javase.io;

import java.io.File;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileTest02
 * @Date: 2024/4/21 19:31 26
 */
public class FileTest02 {
    public static void main(String[] args) {
        File file1 = new File("file.txt");

        if(file1.exists()) {
            file1.delete();
        }

        // 创建File对象

        File file3 = new File("log");
        System.out.println("log文件的绝对路径：" + file3.getAbsolutePath());

        System.out.println("log的名字：" + file3.getName());


        File file4 = new File("");

    }
}
