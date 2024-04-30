package com.powernode.javase.oop10;

/**
 * time :2024/3/11 13:30 34
 * ClassName :SingletonTest01
 * Package :com.powernode.javase.oop10
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.get();
        Singleton s2 = Singleton.get();

        System.out.println(s1 == s2);


    }
}
