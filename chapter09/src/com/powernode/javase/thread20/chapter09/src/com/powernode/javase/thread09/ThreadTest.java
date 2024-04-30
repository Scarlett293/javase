package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread09;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread09
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 15:26 51
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.setName("t");
        t.start();
        System.out.println("main begin");

        t.join();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
        System.out.println("main over");
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}
