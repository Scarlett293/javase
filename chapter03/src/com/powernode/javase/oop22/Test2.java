package com.powernode.javase.oop22;

/**
 * time :2024/3/13 19:19 16
 * ClassName :Test2
 * Package :com.powernode.javase.oop22
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test2 {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.name);
    }
}

class A {
    String name = "张三";
}

class B extends A {
    String name = "李四";
}
