package com.powernode.javase.oop19;

/**
 * time :2024/3/12 22:15 05
 * ClassName :Cat
 * Package :com.powernode.javase.oop19
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在跑");
    }

    /**
     * 这个方法的行为是子类特有的，父类没有
     */
    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
