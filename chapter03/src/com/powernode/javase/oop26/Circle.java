package com.powernode.javase.oop26;

/**
 * time :2024/3/13 21:39 16
 * ClassName :Circle
 * Package :com.powernode.javase.oop26
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Circle extends Shape{

    double radius;

    public Circle(String name, String color,double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("该圆形的面积为" + (radius * radius * Constant.MATH_PAI));
    }
}
