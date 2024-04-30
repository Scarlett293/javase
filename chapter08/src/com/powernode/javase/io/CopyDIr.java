package com.powernode.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: CopyDIr
 * @Date: 2024/4/21 20:16 39
 */
public class CopyDIr {
    public static void main(String[] args) {
        // File src = new File("D:\\JavaLearn\\draw");
        // File dest = new File("H:\\");

        // 开始拷贝
        // copy(src , dest);
    }

    /**
     * 拷贝目录的方法
     *
     * @param src  拷贝源
     * @param dest 拷贝目标
     */
    private static void copy(File src, File dest) {
        if (src.isFile()) {
            // 是文件的时候要拷贝
            try (FileInputStream in = new FileInputStream(src);
                 FileOutputStream out = new FileOutputStream(dest.getAbsolutePath() + src.getAbsolutePath().substring(2))) {
                //
                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        //
        File newDir = new File(dest.getAbsolutePath() + src.getAbsolutePath().substring(2));
        if (!newDir.exists()) {
            newDir.mkdir();
        }
        File[] files = src.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            copy(file, dest);
        }
    }
}
