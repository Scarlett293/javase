package com.powernode.javase.oop27;

/**
 * time :2024/3/16 13:51 36
 * ClassName :Computer
 * Package :com.powernode.javase.oop27
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Computer {

    public void conn(HardDrive hardDrive) {
        System.out.println("链接设备成功");
        hardDrive.read();
        hardDrive.write();
    }
}
