package com.powernode.javase.annotation;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase.annotation
 * @ClassName: AnnotationTest03
 * @Date: 2024/4/25 11:52 00
 */
//@SuppressWarnings("all")
public class AnnotationTest03 {
    public static void main(String[] args) throws Exception {
        // @SuppressWarnings("rawtypes")
        List list = new ArrayList();

        // @SuppressWarnings("resource")
        FileInputStream in = new FileInputStream("a:/file.txt");


        // @SuppressWarnings("deprecation")
        MyClass1 myClass1 = new MyClass1();
    }
}
