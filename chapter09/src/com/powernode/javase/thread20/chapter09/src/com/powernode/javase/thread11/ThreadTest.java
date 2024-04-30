package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread11;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread11
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 15:45 24
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("t1");

        Thread t2 = new MyThread();
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if(Thread.currentThread().getName().equals("t1") && i % 10 == 0 ) {
                System.out.println(Thread.currentThread().getName() + "让位了，此时的i下标是：" + i);
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}
