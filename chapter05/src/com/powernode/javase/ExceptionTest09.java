package com.powernode.javase;

/**
 * time :2024/4/13 19:08 36
 * ClassName :ExceptionTest09
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * finally语句块
 */
public class ExceptionTest09 {
    public static void main(String[] args) {

        // m();
        // m2();

        int result = m3();
        System.out.println(result);

    }

    public static void m() {
        try {
            System.out.println("try...");
            return;
        } finally {
            System.out.println("finally...");
        }
    }

    public static void m1() {
        try {
            System.out.println("try...");
            return;
        } finally {
            System.out.println("finally...");

        }

        // 这里就不能写代码
        // System.out.println("m1 over");
    }

    public static void m2() {
        try {
            System.out.println("try...");
            System.exit(0);
        } finally {
            // 这里的代码无法执行
            System.out.println("finally...");
        }
    }

    public static int m3() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }
}
