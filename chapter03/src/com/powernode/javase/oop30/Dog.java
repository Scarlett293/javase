package com.powernode.javase.oop30;

/**
 * time :2024/3/16 14:30 44
 * ClassName :Dog
 * Package :com.powernode.javase.oop30
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Dog extends Animal{


    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println(this.getName() + "吃骨头");
    }

}
