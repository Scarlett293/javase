package com.powernode.javase.io;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: Student
 * @Date: 2024/4/21 11:22 22
 */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -4233529216925905685L;
    private String name;
    private transient int age;

    private String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
