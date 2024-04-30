package com.powernode.javase.oop11;

/**
 * time :2024/3/11 18:53 57
 * ClassName :SingletonTest
 * Package :com.powernode.javase.oop11
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.get();
        Singleton s2 = Singleton.get();

        System.out.println(s1 == s2);
    }
}
