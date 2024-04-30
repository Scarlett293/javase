package com.powernode.javase.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: FileTest04
 * @Date: 2024/4/21 20:04 40
 */
public class FileTest04 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\JavaLearn\\draw");


        File[] files = file.listFiles();
/*
        for (File f : files) {
            System.out.println(f.getName());
        }*/

        System.out.println("=================");

        File file1 = new File("D:\\JavaLearn\\draw");
        File[] files1 = file1.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".mdj");
            }
        });

        for(File f : files1) {
            System.out.println(f.getName());
        }


    }
}
