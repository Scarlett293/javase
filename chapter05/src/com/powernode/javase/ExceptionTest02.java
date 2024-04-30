package com.powernode.javase;

/**
 * time :2024/4/13 16:37 20
 * ClassName :ExceptionTest02
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 异常在程序中到底是如何发生的？
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        // 异常的发生需要经历两个阶段
        // 第一个阶段：创建异常对象
        NullPointerException e = new NullPointerException();
        // 第二个阶段：让异常发生 （手动抛出异常）
        // throw e;
    }
}
