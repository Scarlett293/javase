package com.powernode.javase.annotation.reflect;

/**
 * ClassName: MyClass
 * Decription:
 * Package: com.powernode.javase.annotation.reflect
 * Date: 2024/4/25 15:17
 * Author: Scalett
 * Version: 1.0
 */
@Annotation1(name = "张三", age = 20)
@Annotation2(email = "zhangsan@123.com", price = 3000.0)
public class MyClass {
    @Annotation1
    @Annotation2
    String s;

    @Annotation1
    @Annotation2
    public void doSome(){}
}
