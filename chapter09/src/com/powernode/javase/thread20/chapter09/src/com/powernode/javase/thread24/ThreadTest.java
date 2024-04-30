package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread24;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread24
 * @ClassName: ThreadTest
 * @Date: 2024/4/23 11:13 57
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 创建“未来任务”对象
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Thread.sleep(1000 * 5);
                return 1;
            }
        });

        //
        Thread t = new Thread(task);

        //
        t.start();

        //
        Integer i = null;
        try {
            i = task.get();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*

class MyRunnable implements Runnable {
    @Override
    public void run() {

    }
}

class MyThread extends Thread {
    @Override
    public void run() {

    }
}
*/
