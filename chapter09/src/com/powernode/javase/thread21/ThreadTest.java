package com.powernode.javase.thread21;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread21
 * @ClassName: ThreadTest
 * @Date: 2024/4/23 10:28 55
 */
public class ThreadTest {
    private static final Object lock = new Object();

    private static boolean t1Output = true;
    private static boolean t2Output = false;
    private static boolean t3Output = false;


    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t1Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + "--->" + "A");
                        t1Output = false;
                        t2Output = true;
                        // 唤醒所有的线程
                        lock.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t2Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + "--->" + "B");
                        t2Output = false;
                        t3Output = true;
                        // 唤醒所有的线程
                        lock.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t3Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + "--->" + "C");
                        t3Output = false;
                        t1Output = true;
                        // 唤醒所有的线程
                        lock.notifyAll();
                    }
                }
            }
        }).start();

    }
}
