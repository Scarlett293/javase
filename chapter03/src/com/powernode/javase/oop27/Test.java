package com.powernode.javase.oop27;

/**
 * time :2024/3/16 13:54 13
 * ClassName :Test
 * Package :com.powernode.javase.oop27
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 不使用接口，分析存在哪些缺点？
 *      违背DCP开闭原则
 *      Computer的扩展能力差
 *      为什么？
 *          因为Computer中使用了HardDrive类，以及Printer乐
 *          HardDrive和Printer的耦合度过高
 */
public class Test {
    public static void main(String[] args) {
        // 创建硬盘对象
        Computer c = new Computer();
        // 创建电脑对象
        HardDrive h = new HardDrive();
        // 电脑连接硬盘

        c.conn(h);
    }
}
