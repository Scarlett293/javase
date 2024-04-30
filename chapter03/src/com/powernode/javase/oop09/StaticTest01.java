package com.powernode.javase.oop09;

/**
 * time :2024/3/9 21:40 24
 * ClassName :StaticTest01
 * Package :com.powernode.javase.oop09
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StaticTest01 {
    static {
        System.out.println("静态代码块1执行了");
    }

    public static void main(String[] args) {
        System.out.println("main execute!");
    }
}
