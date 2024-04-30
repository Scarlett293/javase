package com.powernode.javase.annotation;

/**
 * ClassName: Test2
 * Decription: 这是一个简单的测试类
 * Package: com.powernode.javase.annotation
 * Date: 2024/4/25 15:01
 * Author: Scalett
 * Version: 1.0
 */
public class Test2 {

    /**
     * number field
     */
    @MyAnnotation
    public static int num = 100;


    /**
     * do something!
     */
    @MyAnnotation
    public void doSome(){}


    /**
     * constructor
     */
    @MyAnnotation
    public Test2() {

    }
}
