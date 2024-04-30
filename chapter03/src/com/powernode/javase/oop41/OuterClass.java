package com.powernode.javase.oop41;

/**
 * time :2024/3/27 22:30 58
 * ClassName :OuterClass
 * Package :com.powernode.javase.oop41
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 局部内部类
 *
 */
public class OuterClass {

    // 静态变量
    private static int k = 1;
    // 静态方法
    private int f = 2;

    public void m1() {
        // 局部变量
        int i = 100;
        // 局部内部类
        class InnerClass {
            // 实例方法
            public void x() {
                System.out.println(k);
                System.out.println(f);
                System.out.println(i);
            }
        }
        // new 对象
        InnerClass innerClass = new InnerClass();
        innerClass.x();
    }

    public static void m2() {
        // 局部内部类
        class InnerClass {
            public void x() {
                System.out.println(k);
            }
        }
    }
}
