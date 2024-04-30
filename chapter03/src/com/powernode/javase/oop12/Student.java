package com.powernode.javase.oop12;

/**
 * time :2024/3/11 18:58 51
 * ClassName :Student
 * Package :com.powernode.javase.oop12
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Student {
    private String name;
    private int age;
    private boolean gender;

    public Student() {
    }

    public Student(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
        if(age >= 0 && age <= 120) {
            this.age = age;
        }
        System.out.println("输入的年龄不合法！");
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
