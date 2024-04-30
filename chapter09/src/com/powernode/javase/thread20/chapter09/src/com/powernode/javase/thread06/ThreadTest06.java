package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread06;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread06
 * @ClassName: ThreadTest06
 * @Date: 2024/4/22 14:33 59
 */


public class ThreadTest06 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.setName("t");
        t.start();

        // 5秒之后终止线程t的执行
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 终止线程t的执行
        mr.run = false;
    }
}

class MyRunnable implements Runnable {
    /**
     * 是否继续执行的标记
     * true表示：继续执行
     * false表示：终止执行
     */
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "===>" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                return;
            }
        }
    }
}
