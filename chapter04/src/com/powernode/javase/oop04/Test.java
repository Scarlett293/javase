package com.powernode.javase.oop04;


import java.util.Scanner;

/**
 * time :2024/4/5 19:43 16
 * ClassName :Test
 * Package :com.powernode.javase.oop04
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) {
        Student zs = new Student("张三", "1990-01-01", true, "15522556464");
        Student ls = new Student("李四", "1990-01-01", true, "15522556464");
        Student ww = new Student("王五", "1990-01-01", true, "15522556464");
        zs.setNum(1);
        ls.setNum(2);
        ww.setNum(3);
        Student[] list = {
                zs,
                ls,
                ww
        };

        StudentManager sm = new StudentManager(list);

        Scanner s = new Scanner(System.in);

        System.out.println("欢迎使用学生管理系统，请认真查阅使用说明");
        System.out.println("输入对应的编号使用对应的功能");
        System.out.println("1 显示所有学生的信息");
        System.out.println("2 通过学号查找学生的信息");
        System.out.println("3 添加新的学生信息");
        System.out.println("4 修改学生信息");
        System.out.println("5 删除学生信息");
        System.out.println("0 退出程序");

        while (true) {
            System.out.print("请输入对应的编号: ");
            int select = s.nextInt();
            s.nextLine();
            switch (select) {
                case 1 -> sm.display();
                case 2 -> {
                    System.out.print("请输入该学生的学号: ");
                    int num = s.nextInt();
                    sm.findStudentInfo(num);
                }
                case 3 -> {
                    System.out.print("请输入学生的姓名: ");
                    String name = s.nextLine();
                    System.out.print("请输入学生的出生日期(例如: 1990-02-02): ");
                    String date = s.nextLine();
                    System.out.print("请输入学生的性别: ");
                    boolean sex = s.nextLine().equals("男") ? true : false;
                    System.out.print("请输入学生的联系方式: ");
                    String phone = s.nextLine();
                    sm.addStudentInfo(name, date, sex, phone);
                }
                case 4 -> {
                    System.out.print("请输入学生的学号: ");
                    int num = s.nextInt();
                    s.nextLine();

                    System.out.print("请输入修改后的姓名: ");
                    String name = s.nextLine();
                    System.out.print("请输入修改后的出生日期(例如: 1990-02-02): ");
                    String date = s.nextLine();
                    System.out.print("请输入学生的性别: ");
                    boolean sex = s.nextLine().equals("男") ? true : false;
                    System.out.print("请输入修改后的手机号: ");
                    String phone = s.nextLine();
                    sm.setStudentInfo(num, name, date, sex, phone);
                }
                case 5 -> {
                    System.out.println("请输入要删除的学生学号: ");
                    int num = s.nextInt();
                    s.nextLine();
                    sm.deleteStudentInfo(num);
                }
                case 0 -> System.exit(0);
            }
        }
    }
}
