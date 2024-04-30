package com.powernode.javase.student;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * time :2024/4/8 20:14 00
 * ClassName :StudentServiceTest
 * Package :com.powernode.javase.student
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StudentServiceTest {

    private static StudentService studentService;
    @BeforeAll
    public static void before() {
        // 进行所有单元测试开始之前的准备工作
         studentService = new StudentService();

    }

    @Test
    public void testDisplayAll() {
        studentService.displayAll();
    }

    @Test
    public void testDisplayByNo() {
        studentService.displayByNo(1);
    }

    @Test
    public void testAdd() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("程序执行到这里了");
    }

    @Test
    public void testModify() {

    }

    @Test
    public void testDelete() {

    }
}
