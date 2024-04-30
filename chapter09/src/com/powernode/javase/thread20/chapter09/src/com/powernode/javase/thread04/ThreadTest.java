package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread04;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread04
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 14:11 06
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 创建线程对象并启动

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "===> begin");
                try {
                    // 睡眠一年
                    Thread.sleep(1000 * 60 * 60 * 24 * 365);
                } catch (InterruptedException e) {
                    // 打印异常信息
                    // throw new RuntimeException(e);
                    // e.printStackTrace();
                    System.out.println("知道了，这就起床！");
                }
                // 睡眠一年之后，起来干活了
                System.out.println(Thread.currentThread().getName() + " do some !");
            }
        });

        // 启动线程
        t.start();

        // 主线程
        // 要求：5秒之后，睡眠的Thread-0线程起来干活
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Thread-0起来干活了
        t.interrupt();
    }
}
