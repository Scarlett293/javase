package com.powernode.javase.oop39;

/**
 * time :2024/3/27 21:28 21
 * ClassName :OuterClassTest
 * Package :com.powernode.javase.oop39
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 静态内部类
 */
public class OuterClassTest {
    public static void main(String[] args) {
        // 创建内部类对象
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        // 调用方法
        innerClass.m3();

        OuterClass.InnerClass.m4();
    }
}
