package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread03;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread03
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 13:43 49
 */

/**
 * 关于sleep的面试题
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("t");
        t.start();

        try {
            t.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}
