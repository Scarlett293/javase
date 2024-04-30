package com.powernode.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileTest03
 * @Date: 2024/4/21 19:56 51
 */
public class FileTest03 {
    public static void main(String[] args) {
        File file1 = new File("file");


        //
        System.out.println(file1.isHidden() ? "隐藏文件" : "非隐藏文件");

        long l = file1.lastModified();
        Date time = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(time));

        System.out.println(file1.length());

        File file2 = new File("file2");
        file1.renameTo(file2);
    }
}
