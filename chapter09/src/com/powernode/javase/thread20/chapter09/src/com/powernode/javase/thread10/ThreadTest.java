package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread10;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread10
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 15:37 16
 */
public class ThreadTest {
    public static void main(String[] args) {
/*        System.out.println("最低优先级：" + Thread.MIN_PRIORITY);
        System.out.println("最低优先级：" + Thread.MAX_PRIORITY);
        System.out.println("最低优先级：" + Thread.NORM_PRIORITY);

        // 获取main的线程优先级
        Thread mainThread = Thread.currentThread();
        System.out.println("main线程的优先级：" + mainThread.getPriority());

        mainThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("main线程的优先级：" + mainThread.getPriority());*/

        Thread t1 = new MyThread();
        t1.setName("t1");
        Thread t2 = new MyThread();
        t2.setName("t2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}
