package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread02;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread02
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 13:33 47
 */

/**
 *
 */
public class ThreadTest {
    public static void main(String[] args) {
        try {
            //
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + "====>" + i);
        }

        Thread t = new Thread(new MyRunnable());
        t.setName("t");
        t.start();
    }


}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "====>" + i);
        }
    }
}
