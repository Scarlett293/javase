package com.powernode.javase.thread05;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread05
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 14:24 55
 */

/**
 * 一个线程t一直在正常的运行，如何终止t线程的运行
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.setName("t");
        t.start();

        // 5秒之后，t线程终止

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 终止线程t的执行。
        // 从java2开始就不建议使用了，因为这种方式是强行终止线程，容易导致数据丢失。
        // 没有保存的数据，在内存中的数据一定会因为此方式导致丢失
        t.stop();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "===>" + i);
        }
    }
}
