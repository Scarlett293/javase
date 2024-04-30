package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileInputOutputStreamCopy
 * @Date: 2024/4/20 16:14 01
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝，实现原理：
 *      使用FileInputStream读文件，使用FileOutputStream写文件。
 *      一边读一边写
 */
public class FileInputOutputStreamCopy {
    public static void main(String[] args) {

        // 输入流
        FileInputStream in = null;
        // 输出流
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D:\\JavaLearn\\code\\file1.txt");
            out = new FileOutputStream("D:\\JavaLearn\\code\\file3.txt");

            // 一次至少拷贝1kb
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }

            // 刷新
            out.flush();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭（分别try...catch）
            if(null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
