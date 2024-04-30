package com.powernode.javase.singleton;

/**
 * @author :29369
 * @Package: com.powernode.javase.singleton
 * @ClassName: Singleton
 * @Date: 2024/4/23 10:43 24
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * 懒汉式单例模式u
 */
/*
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);

    }
}
*/
class SingletonTest {
    private static Singleton s1;
    private static Singleton s2;

    public static void main(String[] args) {


        // 获取某个类


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton.getSingleton();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Singleton.getSingleton();
            }
        });

        t1.start();
        t2.start();
        //

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);


    }
}

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
        System.out.println("构造方法执行了");
    }

    /*    public static Singleton getSingleton() {
            if (singleton == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                singleton = new Singleton();
            }
            return singleton;
        }*/
/*    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            singleton = new Singleton();
        }
        return singleton;
    }*/
/*    public static Singleton getSingleton() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                singleton = new Singleton();
            }
        }
        return singleton;
    }*/
/*    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/

    // 使用lock来实现线程安全
    // lock是接口，从JDK5开始引入的
    // Lock接口
    // 注意：要想使用ReentrantLock达到线程安全，假设要让t1 t2 t3线程同步，就需要让t1 t2 t3共享同一个lock
    private static final ReentrantLock lock = new ReentrantLock();

    public static Singleton getSingleton() {
        if (singleton == null) {
            try {
                // 加锁
                lock.lock();
                if (singleton == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                    singleton = new Singleton();
                }
            } finally {
                // 解锁（需要100%保证解锁，怎么办？finally？）
                lock.unlock();
            }
        }
        return singleton;
    }


}
