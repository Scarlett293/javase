package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: User
 * @Date: 2024/4/23 12:11 10
 */
public class User {

    {
        System.out.println("User的静态代码块执行了");
    }

    private String name;
    private int age;



    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        System.out.println("无参构造启动了");
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
}
