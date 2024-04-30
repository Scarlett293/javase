package com.powernode.javase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * time :2024/4/13 17:59 01
 * ClassName :ExceptionTest06
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }

    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        FileInputStream in = new FileInputStream("e:/a.txt");
    }
}
