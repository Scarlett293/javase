package com.powernode.javase.thread17;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread17
 * @ClassName: ThreadTest
 * @Date: 2024/4/23 09:16 57
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Thread t1 = new Thread(new MyRunnable(mc1));
        Thread t2 = new Thread(new MyRunnable(mc2));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}

class MyRunnable implements Runnable {
    private MyClass mc;
    public MyRunnable(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if("t1".equals(Thread.currentThread().getName())) {
            mc.m1();
        }
        if("m2".equals(Thread.currentThread().getName())) {
            mc.m2();
        }
    }
}

class MyClass {
    public synchronized void m1() {
        System.out.println("m1 begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m1 over");
    }

    public void m2() {
        System.out.println("m2 begin");
        System.out.println("m2 over");
    }
}
