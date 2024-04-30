package com.powernode.javase.io.clone;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.clone
 * @ClassName: User
 * @Date: 2024/4/22 09:43 46
 */
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 387072087441835002L;


    private String name;
    private int age;
    private Address addr;

    public User(String name, int age, Address addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public User() {
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

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }
}
