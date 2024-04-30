package com.powernode.javase.oop19;

/**
 * time :2024/3/12 22:19 17
 * ClassName :Bird
 * Package :com.powernode.javase.oop19
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Bird extends Animal{

    @Override
    public void move() {
        System.out.println("鸟在飞");
    }

    public void sing() {
        System.out.println("鸟儿正在唱歌");
    }
}
