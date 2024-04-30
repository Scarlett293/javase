package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: GZIPOutputStream
 * @Date: 2024/4/21 22:43 21
 */
public class GZIPOutputStreamTest {
    public static void main(String[] args) throws Exception {
        // 创建文件字节输入流（读某个文件这个文件将来就是被压缩的。）
        FileInputStream in = new FileInputStream("e:/text.txt");


        // 创建一个GZIP压缩流对象
        GZIPOutputStream gzip = new GZIPOutputStream(new FileOutputStream("e:/test.txt.gz"));

        // 开始压缩（一边读一边写）
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while((readCount = in.read(bytes)) != -1) {
            gzip.write(bytes, 0, readCount);
        }

        // 非常重要的代码需要调用
        // 刷新并且最终生成压缩文件
        gzip.finish();

        // 关闭流
        in.close();
        gzip.close();
    }
}
