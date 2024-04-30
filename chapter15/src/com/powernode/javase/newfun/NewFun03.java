package com.powernode.javase.newfun;

/**
 * ClassName: NewFun03
 * Decription:
 * Package: com.powernode.javase.newfun
 * Date: 2024/4/28 10:28
 * Author: Scalett
 * Version: 1.0
 */
public class NewFun03 {
    public static void main(String[] args) {
        // Java14的新特性：instanceof的模式匹配
        // Java16发布的正式版本
        // 以前：
        Animal a = new Cat();
        if(a instanceof Cat) {
            Cat cat = (Cat) a;
            cat.catchMouse();
        }
        // 使用instanceof模式匹配之后
        if(a instanceof Cat c) {
            c.catchMouse();
        }
    }
}
