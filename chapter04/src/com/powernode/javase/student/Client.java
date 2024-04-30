package com.powernode.javase.student;

import java.util.Scanner;

/**
 * time :2024/4/6 13:55 22
 * ClassName :Client
 * Package :com.powernode.javase.student
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Client {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        System.out.println("欢迎使用学生信息管理系统，请认真使用阅读说明");
        System.out.println("使用该系统时需要输入对应的功能编号，来选择对应的功能");
        System.out.println("[1]宣誓所有学生的信息");
        System.out.println("[2]通过学号查找学生的信息");
        System.out.println("[3]添加新的学生信息");
        System.out.println("[4]修改学生信息");
        System.out.println("[5]删除学生信息");
        System.out.println("[0]退出程序");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("请输入功能编号：");
            int useNo = s.nextInt();
            switch (useNo) {
                case 1 -> {
                    studentService.displayAll();
                }
                case 2 -> {
                    System.out.println("请输入学号");
                    int studentNo = s.nextInt();
                    studentService.displayByNo(studentNo);
                }
                case 3 -> {
                    System.out.println("请输入姓名：");
                    String name = s.next();
                    System.out.println("请输入生日：");
                    String birth = s.next();
                    System.out.println("请输入性别：");
                    String gender = s.next();
                    System.out.println("请输入电话：");
                    String phone = s.next();
                    Student student = new Student(name, birth, gender, phone);
                    studentService.add(student);
                    studentService.displayAll();

                }
                case 4 -> {

                    System.out.println("请输入要修改的学号：");
                    int studentNo = s.nextInt();
                    studentService.displayByNo(studentNo);
                    System.out.println("请输入修改的姓名：");
                    String name = s.next();
                    System.out.println("请输入修改的生日：");
                    String birth = s.next();
                    System.out.println("请输入修改的性别：");
                    String gender = s.next();
                    System.out.println("请输入修改的电话：");
                    String phone = s.next();
                    Student student = new Student(studentNo, name, birth, gender, phone);
                    studentService.modify(student);
                    studentService.displayAll();

                }
                case 5 -> {
                    System.out.println("请输入要删除的学号:");
                    int studentNo = s.nextInt();
                    studentService.deleteByNo(studentNo);
                    studentService.displayAll();
                }
                case 0 -> {
                    System.out.println("谢谢使用，再见！");
                    System.exit(0);
                }
            }
        }
    }
}
