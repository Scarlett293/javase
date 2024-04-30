package com.powernode.javase.thread;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread
 * @ClassName: ThreadTest04
 * @Date: 2024/4/22 12:26 44
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        // 创建线程对象
/*        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {

            }
        });*/

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t --->" + i);
                }
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main --->" + i);
        }
    }
}
