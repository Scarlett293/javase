package com.powernode.javase.oop04;

/**
 * time :2024/3/9 18:44 00
 * ClassName :ArgsTest01
 * Package :com.powernode.javase.oop04
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ArgsTest01 {
    public static void main(String[] args) {
        int i = 10;
        add(i);
        System.out.println("main--->" + i);
    }
    public static void add(int i) {
        i++;
        System.out.println("add--->" + i);
    }
}
