package com.powernode.javase.oop36;

/**
 * time :2024/3/27 19:54 30
 * ClassName :Test01
 * Package :com.powernode.javase.oop36
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * hashCode()方法
 *      public native int hashCode();
 *      这是一个本地方法，底层调用了C++写的动态链接库程序：xxx.dll
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Test01 t = new Test01();

        int i = t.hashCode();
        System.out.println(i); // 189568618

        Test01 t2 = new Test01();
        int i2 = t2.hashCode(); //
        System.out.println(i2); // 793589513

    }
}
