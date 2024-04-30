package com.powernode.javase.newfun;

import java.util.Objects;

/**
 * ClassName: User
 * Decription:
 * 这个类中的属性是final修饰的，并且只提供了属性的读取方法，没有提供属性的修改方法。
 * 很明显，这个类其实起到的作用就是，纯数据的载体。
 * Package: com.powernode.javase.newfun
 * Date: 2024/4/28 11:38
 * Author: Scalett
 * Version: 1.0
 */
/*public final class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}*/

// 如果在开发中，你需要这样一个类：专门只做纯数据的载体。那么可以将这种类型定义为Record类型。
public record User(String name, int age) {
    // 自动带有两个实例变量，并且被final修饰。一个是name，一个是age
    // 自动带有toString 方法
    // 自动带有hashCode + equals 方法
    // 自动带有 name() 方法
    // 自动带有 age() 方法
    // Record类型中可以添加什么？
    // 无参数的构造方法
    public User{
        System.out.println("Record类型的无参构造方法");
    }
    // 静态变量
    static int i = 100;
    // 静态方法
    public static void m1() {
        System.out.println("m1...");
    }
    // 实例方法
    public void m2() {
        System.out.println("m2...");
    }
}

class UserTest {
    public static void main(String[] args) {
        User user = new User("zhangsan", 20);
        System.out.println(user.name());
        System.out.println(user.age());
        System.out.println(user.toString());
        System.out.println("静态变量：" + User.i);
        User.m1();
        user.m2();
    }
}
