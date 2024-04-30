package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread
 * @ClassName: ThreadTest02
 * @Date: 2024/4/22 12:04 39
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main --->" + i);
        }
    }
}

// 自定义一个线程类
// java.lang.Thread 本身就是一个线程。
// MyThread继承Thread，因此MyThread本身也是一个线程。

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread--->" + i);
        }
    }
}
