package com.powernode.javase.oop07;

/**
 * time :2024/3/9 19:21 16
 * ClassName :EmployeeTest01
 * Package :com.powernode.javase.oop07
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("张三");
        e1.setAge(30);
        e1.setWages(5000);

        System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getWages());
        e1.raise(1000);
        e1.raise(1000);
        e1.raise(1000);
        e1.raise(1000);
        e1.raise(1000);
        e1.raise(1000);
    }
}
