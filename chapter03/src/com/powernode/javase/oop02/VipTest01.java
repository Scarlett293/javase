package com.powernode.javase.oop02;

/**
 * time :2024/3/9 17:55 37
 * ClassName :VipTest01
 * Package :com.powernode.javase.oop02
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class VipTest01 {
    public static void main(String[] args) {
        Vip vip1 = new Vip();
        vip1.name = "jack";
        vip1.age = 20;
        System.out.println("name=" + vip1.name);
        System.out.println("age=" + vip1.name);
        Vip vip2 = new Vip();
        vip2.name = "lisi";
        vip2.age = 15;
    }
}
