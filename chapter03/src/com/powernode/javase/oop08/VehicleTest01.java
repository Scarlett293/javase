package com.powernode.javase.oop08;

/**
 * time :2024/3/9 20:53 26
 * ClassName :VehicleTest01
 * Package :com.powernode.javase.oop08
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class VehicleTest01 {
    public static void main(String[] args) {
        Vehicle bmw535li = new Vehicle("BMW535li", 0, 5200, 1800, 1500);

        // 加速
        bmw535li.speedUp();

        // 加速
        bmw535li.speedUp();

        // 减速
        bmw535li.speedDown();

        // 单独调用mov()方法
        bmw535li.move();
    }
}
