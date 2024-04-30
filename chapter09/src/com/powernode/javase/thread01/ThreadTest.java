package com.powernode.javase.thread01;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread01
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 12:30 32
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 获取当前线程对象
        Thread mainThread = Thread.currentThread();

        // 获取当前线程的名字
        System.out.println("主线程的名字：" + mainThread.getName()); // 主线程名字：main

        // 创建线程对象
        Thread t = new MyThread("tt");
        // 修改线程的名字
        // t.setName("t");
        t.start();

        Thread t1 = new MyThread("tt1");
        // t1.setName("t1");
        t1.start();
    }
}

class MyThread extends Thread {

    public MyThread(String threadName) {
        super(threadName);
    }


    @Override
    public void run() {
        // 获取当前线程对象
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
