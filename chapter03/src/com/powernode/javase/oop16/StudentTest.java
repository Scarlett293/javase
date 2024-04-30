package com.powernode.javase.oop16;

/**
 * time :2024/3/11 19:47 01
 * ClassName :StudentTest
 * Package :com.powernode.javase.oop16
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StudentTest {
    public static void main(String[] args) {
        Course course = new Course("java", "老杜");

        Student zhangsan = new Student("张三", "001");

        Student lisi = new Student("李四", "002", course);


    }
}
