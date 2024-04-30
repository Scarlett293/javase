package com.powernode.javase.oop26;

/**
 * time :2024/3/13 21:47 07
 * ClassName :Roctangle
 * Package :com.powernode.javase.oop26
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Roctangle extends Shape{

    double width;
    double height;

    public Roctangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("该矩形的面积是" + (width * height));
    }
}
