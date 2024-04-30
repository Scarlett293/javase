package com.powernode.javase.oop28;

/**
 * time :2024/3/16 14:00 50
 * ClassName :HardDrive
 * Package :com.powernode.javase.oop28
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class HardDrive implements Usb{
    @Override
    public void read() {
        System.out.println("硬盘开始读了");
    }

    @Override
    public void write() {
        System.out.println("硬盘开始写了");
    }
}
