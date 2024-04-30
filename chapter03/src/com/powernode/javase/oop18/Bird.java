package com.powernode.javase.oop18;

/**
 * time :2024/3/12 21:00 57
 * ClassName :bird
 * Package :com.powernode.javase.oop18
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Bird extends Animal{
    /**
     * Bird对继承过来的move()方法不满意
     * Bird类型有权力对move()方法进行覆盖
     */
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }

    @Override
    public Object getObj(int a, String b) {
        return null;
    }

    public void sing() {
        System.out.println("鸟儿在唱");
    }
}
