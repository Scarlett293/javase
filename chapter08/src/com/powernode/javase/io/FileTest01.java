package com.powernode.javase.io;

import java.io.File;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileTest01
 * @Date: 2024/4/21 19:16 14
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception {
        File file = new File("file");


        System.out.println(file.exists() ? "存在" : "不存在");

/*        if(!file.exists()) {
            file.createNewFile();
        }*/

        //
        if(!file.exists()) {
            file.mkdir();
        }
    }
}
