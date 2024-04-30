package com.powernode.javase.oop01;

/**
 * time :2024/3/9 17:50 04
 * ClassName :StudentTest01
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StudentTest01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("姓名" + s1.name);
        System.out.println("年龄" + s1.age);
        System.out.println("性别" + (s1.gender ? "男" : "女"));
    }
}
