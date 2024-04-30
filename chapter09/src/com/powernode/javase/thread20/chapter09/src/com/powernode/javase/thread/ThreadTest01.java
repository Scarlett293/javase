package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread
 * @ClassName: ThreadTest01
 * @Date: 2024/4/22 11:42 37
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main bengin");
        m1();
        System.out.println("main over");
    }
    private static void m1() {
        System.out.println("m1 begin");;
        m2();
        System.out.println("m1 over");
    }
    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }
    private static void m3() {
        System.out.println("m3 excute!");
    }
}
