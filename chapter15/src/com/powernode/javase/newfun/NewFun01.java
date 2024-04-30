package com.powernode.javase.newfun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: NewFun01
 * Decription:
 * Package: com.powernode.javase.newfun
 * Date: 2024/4/27 23:00
 * Author: Scalett
 * Version: 1.0
 */
public class NewFun01 {
    public static void main(String[] args) throws Exception {
/*        // Java7之前：完成文件复制
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("E:\\powernode\\文件.txt");
            out = new FileOutputStream("E:\\文件.txt");

            // 一边读一边写
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }

            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

        // Java7之后（包括Java7）新特性：try-with-resources
/*        try (FileInputStream in = new FileInputStream("E:\\powernode\\文件.txt");
             FileOutputStream out = new FileOutputStream("E:\\文件.txt")) {
            // 一边读一边写
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }

            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        // java9之后，对try-with-resources进行了再次改进
        FileInputStream in = new FileInputStream("E:\\powernode\\文件.txt");
        FileOutputStream out = new FileOutputStream("E:\\文件.txt");
        try (in; out) {
            // 一边读一边写
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }

            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
