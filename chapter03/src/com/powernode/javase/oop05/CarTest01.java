package com.powernode.javase.oop05;

/**
 * time :2024/3/9 19:11 20
 * ClassName :CarTest01
 * Package :com.powernode.javase.oop05
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CarTest01 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("宝马");
        c1.setPrice(400000);
        c1.setColor("RED");
        System.out.println(c1.getBrand() + c1.getPrice() + c1.getColor());
    }
}
