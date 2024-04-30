package com.powernode.javase.oop30;

/**
 * time :2024/3/16 14:28 53
 * ClassName :XiaoYanZi
 * Package :com.powernode.javase.oop30
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class XiaoYanZi extends Animal implements Flyable{

    public XiaoYanZi(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "吃虫子");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "在飞");
    }
}
