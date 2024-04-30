package com.powernode.javase.oop37;

/**
 * time :2024/3/27 20:12 23
 * ClassName :User
 * Package :com.powernode.javase.oop37
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class User implements Cloneable{

    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                "}";
    }
}
