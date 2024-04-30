package com.powernode.javase.oop28;

/**
 * time :2024/3/16 13:58 40
 * ClassName :Computer
 * Package :com.powernode.javase.oop28
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 电脑类
 * 面向Usb接口调用方法即可
 * 这是调用者
 */
public class Computer {

    public void conn(Usb usb) {
        System.out.println("连接设备成功");

        usb.read();
        usb.write();
    }
}
