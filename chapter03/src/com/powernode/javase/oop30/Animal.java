package com.powernode.javase.oop30;

/**
 * time :2024/3/16 14:26 11
 * ClassName :Animal
 * Package :com.powernode.javase.oop30
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("动物姓名:" + this.getName() + ", " + "动物年龄:" + this.getAge());
    }

    abstract void eat();
}
