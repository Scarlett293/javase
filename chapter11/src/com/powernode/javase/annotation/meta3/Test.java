package com.powernode.javase.annotation.meta3;

/**
 * ClassName: Test
 * Decription:
 * Package: com.powernode.javase.annotation.meta3
 * Date: 2024/4/25 15:09
 * Author: Scalett
 * Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Class<Cat> catClass = Cat.class;
        MyAnnotation annotation = catClass.getAnnotation(MyAnnotation.class);
        System.out.println(annotation);
    }
}
