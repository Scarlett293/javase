package com.powernode.javase;

/**
 * time :2024/4/13 15:53 14
 * ClassName :ExceptionTest01
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 1. 什么是异常？ 异常机制在java中有什么用
 *      java程序执行过程中的意外，错误，出现的不正常的错误。
 *      异常机制在java中有什么用：提高程序的健壮性
 *
 * 2. 在java语言中，异常是以什么形式存在的？
 *      以类和对象的形式存在的
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        if(b == 0) {
            System.out.println("除数不能是0");
            return;
        }
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);


        String s = null;
        s.toString(); // 这里会发生空指针异常，程序执行到这里JVM就会在底层new一个NullPointerException类型的实例

        String s2 = null;
        s2.toString(); // 在底层new一个NullPointerException类型的实例
    }
    /*
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.powernode.javase.ExceptionTest01.main(ExceptionTest01.java:21)
     */
}
