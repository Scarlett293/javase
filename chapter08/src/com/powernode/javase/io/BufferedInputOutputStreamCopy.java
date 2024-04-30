package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: BufferedInputOutputStreamCopy
 * @Date: 2024/4/20 17:57 11
 */

import java.io.*;

/**
 * 使用BufferedInputStream BufferedOutputStream完成文件的拷贝
 */
public class BufferedInputOutputStreamCopy {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file.txt"))) {
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readCount);
            }

            // 手动刷新
            bos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();

        System.out.println("带有缓冲区的拷贝耗时" + (end - begin) + "毫秒");


    }
}
