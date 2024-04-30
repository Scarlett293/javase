package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread
 * @ClassName: ThreadTest03
 * @Date: 2024/4/22 12:20 43
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        //
        // Runnable r = new MyRunnable();
        // 创建线程对象
        // Thread t = new Thread(r)

        Thread t = new Thread(new MyRunnable());

        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main----->" + i);
        }

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("t----->" + i);
        }
    }
}
