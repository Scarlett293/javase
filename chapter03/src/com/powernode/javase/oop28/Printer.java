package com.powernode.javase.oop28;

/**
 * time :2024/3/16 13:58 46
 * ClassName :Printer
 * Package :com.powernode.javase.oop28
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 打印机是是闲着，面向Usb接口写实现类
 */
public class Printer implements Usb{

    @Override
    public void read() {
        System.out.println("打印机开始读了");
    }

    @Override
    public void write() {
        System.out.println("打印机开始写了");
    }
}
