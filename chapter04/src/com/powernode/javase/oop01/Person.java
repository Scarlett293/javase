package com.powernode.javase.oop01;

/**
 * time :2024/4/13 15:23 02
 * ClassName :Person
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

// 凡是自定义类型要做比较的话，这个自定义类型必须实现一个接口：Comparable接口，并且实现compareTo方法，在这个方法中编写比较规则
public class Person implements Comparable{
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        // 编写比较规则
        // 根据年龄进行比较
        // p1.compareTo(p2) p1和p2之间进行比较。
        // this是p1
        // o是p2

        // 当前对象的年龄
        // this.age;

        // 另一个对象的年龄
         Person person = (Person) o;
        // person.age;

        // 按照年龄进行比较
        return this.age - person.age;
    }
}
