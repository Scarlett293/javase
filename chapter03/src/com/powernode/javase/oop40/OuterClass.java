package com.powernode.javase.oop40;

/**
 * time :2024/3/27 21:56 57
 * ClassName :OuterClass
 * Package :com.powernode.javase.oop40
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OuterClass {
    // 实例变量
    private int i = 100;
    // 实例方法
    public void m1() {
        System.out.println("外部类的实例方法m1执行了");
    }
    // 静态变量
    private static int j = 200;
    // 静态方法
    public static void m2() {
        System.out.println("外部类的静态方法m2执行了");
    }


    // 实例内部类
    public class InnerClass {
        public void x() {
            System.out.println(i);
            System.out.println(j);
            m1();
            m2();
        }
    }
}
