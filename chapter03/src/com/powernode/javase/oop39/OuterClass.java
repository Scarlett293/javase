package com.powernode.javase.oop39;

/**
 * time :2024/3/27 21:28 13
 * ClassName :OuterClass
 * Package :com.powernode.javase.oop39
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OuterClass {
    // 静态变量
    private static int i = 100;
    // 实例变量
    private int j = 200;
    // 静态方法
    public static void m1() {
        System.out.println("外部类的m1静态方法执行了");
    }
    // 实例方法
    public void m2() {
        System.out.println("外部类的m2实例方法执行了");
    }
    // 静态内部类
    // 对于静态内部类来说：访问空内阁制权限修饰符在这里都可以使用。
    public static class InnerClass {
        public void m3() {
            System.out.println(i);
            // System.out.println(j);
            m1();
            // m2();
        }

        public static void m4() {
            System.out.println(i);

            m1();
        }
    }
    
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.m3();

        OuterClass.InnerClass.m4();
    }
}
