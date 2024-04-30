package com.powernode.javase.oop40;

/**
 * time :2024/3/27 21:57 06
 * ClassName :OuterClassTest
 * Package :com.powernode.javase.oop40
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OuterClassTest {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();

        innerClass.x();
    }
}
