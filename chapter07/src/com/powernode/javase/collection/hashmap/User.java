package com.powernode.javase.collection.hashmap;

import java.util.Objects;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.hashmap
 * @ClassName: User
 * @Date: 2024/4/18 22:22 17
 */
public class User {

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private String name;
    private int age;

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 如果name一样，age也一样，就表示同一个用户
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof User) {
            User user = (User) obj;
            return user.getName().equals(this.getName()) && user.getAge() == this.getAge();
        }
        return false;
    }
}
