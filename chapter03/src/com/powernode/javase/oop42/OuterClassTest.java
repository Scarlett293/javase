package com.powernode.javase.oop42;

/**
 * time :2024/3/27 22:55 18
 * ClassName :OuterClassTest
 * Package :com.powernode.javase.oop42
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */


/**
 * 匿名内部类
 */
public class OuterClassTest {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer computer = new Computer();

        // 以上conn方法参数上的代码做了两件事：
        // 第一：完成了匿名内部类的定义
        // 第二：同时实例化了一个匿名内部类的对象
        computer.conn(new Usb() {
            // 接口的实现
            @Override
            public void read() {
                System.out.println("read.....");
            }

            @Override
            public void write() {
                System.out.println("write.....");
            }
        });
    }
}

class Computer {
    public void conn(Usb usb) {
        usb.read();
        usb.write();
    }
}

interface Usb {
    void read();
    void write();
}

// 编写一个接口的实现类
class Printer implements Usb {
    @Override
    public void read() {
        System.out.println("开始读取数据");
    }

    @Override
    public void write() {
        System.out.println("开始写入数据");
    }
}
