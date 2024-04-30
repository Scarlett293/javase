package com.powernode.javase.oop28;

/**
 * time :2024/3/16 13:58 34
 * ClassName :Test
 * Package :com.powernode.javase.oop28
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) {

        // 创建硬盘对象
        HardDrive h = new HardDrive();
        // 创建电脑对象
        Computer c = new Computer();
        // 连接设备
        c.conn(h);

        Printer p = new Printer();
        c.conn(p);

        // yClass.m();
    }
}

class MyClass {
    public static void m(String name, String password, int num1, int num2, double num3) {

    }
}
