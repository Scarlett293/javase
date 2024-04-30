package com.powernode.javase.oop21;

/**
 * time :2024/3/13 19:06 05
 * ClassName :Test
 * Package :com.powernode.javase.oop20
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/*
*
*
*
* */

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();



        Master zhangsan = new Master("张三");


        zhangsan.feed(c);
        zhangsan.feed(d);

    }
}
