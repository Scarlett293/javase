package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread25
 * @ClassName: ThreadTest
 * @Date: 2024/4/23 11:26 39
 */
public class ThreadTest {
    public static void main(String[] args) {
        //
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 将任务浇给线程池
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        });
    }
}
