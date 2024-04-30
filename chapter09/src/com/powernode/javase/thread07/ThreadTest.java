package com.powernode.javase.thread07;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread07
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 14:40 09
 */

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("t");
        // 在启动线程之前，设置线程为守护线程
        myThread.setDaemon(true);
        myThread.start();


        // 10s结束
        // main线程中，main线程是一个用户线程。
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(true) {
            System.out.println(Thread.currentThread().getName() + "===>" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
