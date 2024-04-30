package com.powernode.javase.oop26;

/**
 * time :2024/3/13 21:36 56
 * ClassName :Shape
 * Package :com.powernode.javase.oop26
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public abstract class Shape {


    String name;
    String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public abstract void area();

    public void display() {
        this.area();
    }
}
