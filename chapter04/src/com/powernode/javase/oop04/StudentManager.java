package com.powernode.javase.oop04;

/**
 * time :2024/4/5 19:46 50
 * ClassName :StudentManager
 * Package :com.powernode.javase.oop04
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 学生管理系统
 */
public class StudentManager {

    /**
     * 学生数组
     */
    private Student[] list;

    public StudentManager() {

    }

    public StudentManager(Student[] list) {
        this.list = list;
    }


    /**
     * 通过学号查找学生的信息
     *
     * @param num 学号
     */
    public void findStudentInfo(int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getNum() == num) {
                System.out.println(list[i]);
                return;
            }
        }
    }


    /**
     * 添加学生
     */
    public void addStudentInfo(String name, String date, boolean sex, String phone) {
        Student student = new Student(name, date, sex, phone);
        boolean flag = true;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = student;
                list[i].setNum(i + 1);
                flag = false;
                break;
            }
        }
        // 如果flag为true，说明没有空间了，需要扩容
        if (flag) {
            Student[] newList = new Student[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
            for (int i = 0; i < list.length; i++) {
                if (list[i] == null) {
                    list[i] = student;
                    list[i].setNum(i + 1);
                    break;
                }
            }
        }
        display();
    }


    /**
     * 修改学生信息
     *
     * @param num   学号
     * @param name  姓名
     * @param date  出生日期
     * @param phone 手机号
     */
    public void setStudentInfo(int num, String name, String date, boolean sex, String phone) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getNum() == num) {
                list[i].setName(name);
                list[i].setDate(date);
                list[i].setSex(sex);
                list[i].setPhone(phone);
            }
        }
        display();
    }


    /**
     * 删除学生信息
     *
     * @param num 学号
     */
    public void deleteStudentInfo(int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getNum() == num) {
                list[i] = null;
            }
        }
        display();
    }

    /**
     * 显示所有学生的信息
     */
    public void display() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
