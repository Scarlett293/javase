package com.powernode.javase.oop04;


/**
 * time :2024/4/5 19:40 20
 * ClassName :Student
 * Package :com.powernode.javase.oop04
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 学生类
 */
public class Student {
    private String name;
    private int num;
    private String date;
    private boolean sex;
    private String phone;


    public Student() {
    }

    public Student(String name, String date, boolean sex, String phone) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[" + this.name + "," + this.num + "," + this.date + "," + (this.sex ? "男" : "女") + "," + this.phone + "]";
    }
}
