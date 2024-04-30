package com.powernode.javase.oop34;

/**
 * time :2024/3/25 22:57 18
 * ClassName :StudentTest
 * Package :com.powernode.javase.oop34
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("张三", 20, "男", "河南省漯河市", "2936900025@qq.com");

        System.out.println(s); // com.powernode.javase.oop34.Student@2f4d3709
        // 张三, 20, 男, 河南省漯河市, 2936900025@qq.com
    }
}
