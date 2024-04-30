package com.powernode.javase.thread20;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread20
 * @ClassName: ThreadTest
 * @Date: 2024/4/23 10:04 15
 */

/**
 * 凶
 */
public class ThreadTest {
    public static void main(String[] args) {

        MyRunnable2 mr = new MyRunnable2();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }


}

class MyRunnable2 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {


            synchronized (this) {
                // 记得唤醒t1线程
                this.notify();
                if (count >= 100) break;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "--->" + ++count);
                // 等，这个等待的线程
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
