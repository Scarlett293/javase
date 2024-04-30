package com.powernode.javase.oop21;

/**
 * time :2024/3/13 19:06 25
 * ClassName :Master
 * Package :com.powernode.javase.oop20
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Master {
    String name;

    public Master(String name) {
        this.name = name;

    }

    public void feed(Pet p) {
        p.eat();
    }
}
