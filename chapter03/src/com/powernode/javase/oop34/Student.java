package com.powernode.javase.oop34;

/**
 * time :2024/3/25 22:55 07
 * ClassName :Student
 * Package :com.powernode.javase.oop34
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 学生类：
 *      姓名
 *      年龄
 *      性别
 *      住址
 *      邮箱
 */
public class Student {
    private String name;
    private int age;
    private String sex;
    private String address;
    private String email;

    public Student() {
    }

    public Student(String name, int age, String sex, String address, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.sex + ", " + this.address + ", " + this.email;
    }
}
