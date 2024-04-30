package com.powernode.javase.oop26;

/**
 * time :2024/3/13 21:50 15
 * ClassName :ShapeTest01
 * Package :com.powernode.javase.oop26
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ShapeTest01 {
    public static void main(String[] args) {
        Shape c = new Circle("圆形", "BLACK", 5.5);
        Shape r = new Roctangle("矩形", "WHITE", 5.5, 6.6);

        c.display();
        r.display();
    }
}
