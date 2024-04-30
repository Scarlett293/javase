package com.powernode.javase.oop07;

/**
 * time :2024/3/9 19:18 21
 * ClassName :Employee
 * Package :com.powernode.javase.oop07
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Employee {
    private String name;
    private int age;
    private double wages;

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

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void raise(double increase) {
        if(this.wages + increase > 10000) {
            System.out.println("该员工的工资过高！");
            return;
        }
        System.out.println("涨薪成功，该员工涨薪后的工资为：" + (this.wages += increase));
    }
}
