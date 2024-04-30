package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: GZIPInputStreamTest
 * @Date: 2024/4/21 22:51 24
 */
public class GZIPInputStreamTest {
    public static void main(String[] args) throws Exception {
        // 创建GZIP解压缩流对象
        GZIPInputStream gzip = new GZIPInputStream(new FileInputStream("e:/test.txt.gz"));

        // 创建文件字节输出流
        FileOutputStream out = new FileOutputStream("e:/test.txt");

        // 一边读一边写
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while ((readCount = gzip.read(bytes)) != -1) {
            out.write(bytes, 0, readCount);
        }


        // 关闭流
        gzip.close();
        // 字节流关闭的时候会自动率先你，包装流是需要手动刷新的。（补充的知识点）
        out.close();
    }
}
