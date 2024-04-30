package com.powernode.javase.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: BufferedOutputSteram
 * @Date: 2024/4/20 17:49 40
 */
public class BufferedOutputStreamTest01 {
    public static void main(String[] args) {

        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream("file.txt"));

            bos.write("动力结点".getBytes());
            // 缓冲流需要手动刷新
            bos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(null != bos) {
                try {
                    // 只需要关闭最外层的包装流即可
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
