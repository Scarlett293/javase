package com.powernode.javase.oop30;

/**
 * time :2024/3/16 14:33 07
 * ClassName :YingWu
 * Package :com.powernode.javase.oop30
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class YingWu extends Animal implements Speakable, Flyable{
    public YingWu(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(this.getName() + "吃史");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + "在说话");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "在飞");
    }
}
