package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread20;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread20
 * @ClassName: SellTicket
 * @Date: 2024/4/23 09:57 11
 */
public class SellTicket {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        // 创建三个线程
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("1");
        t2.setName("2");
        t3.setName("3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyRunnable implements Runnable {
    // 实例变量（多线程共享）
    private int ticketTotal = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticketTotal <= 0) {
                    System.out.println("票已售完...");
                    break;
                }

                // 票还有
                // 一般出票
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票，还有" + (--ticketTotal) + "张票");
            }
        }
    }
}
