package com.powernode.javase.oop28;

/**
 * time :2024/3/16 13:59 09
 * ClassName :Usb
 * Package :com.powernode.javase.oop28
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 这是一个抽象的Usb接口
 * 调用者是Computer
 * 实现者是HardDrive 和 Printer
 * 调用者和实现者都是面向Usb接口写代码的
 */
public interface Usb {

    void read();

    void write();
}
