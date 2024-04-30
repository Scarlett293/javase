package com.powernode.javase.oop10;

/**
 * time :2024/3/11 13:27 51
 * ClassName :StudentTest01
 * Package :com.powernode.javase.oop10
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StudentTest01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student();
        System.out.println(s2);

        System.out.println(s1 == s2);
    }
}
