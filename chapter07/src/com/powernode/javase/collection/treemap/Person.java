package com.powernode.javase.collection.treemap;

import java.util.Objects;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.treemap
 * @ClassName: Person
 * @Date: 2024/4/19 20:09 48
 */

/**
 * 这种排序方式让key元素实现Comparable接口。
 * 这种设计方式有点侵入式
 * <p>
 * 什么时候使用这种方式：比较规则不会发生改变
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {

    }

    public Person(String name, int age) {
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
    public int compareTo(Person o) {
        // 编写比较规则
        // 按照年龄排序
        // return this.age - o.age;
        // 按照名字排序
        // return this.name.compareTo(o.name);

        // 先按照名字进行排序，如果名字相同，则按照年龄排序
/*        if(this.name.equals(o.name)) {
            return this.age - o.age;
        }*/


        // return this.name.compareTo(o.name);

        // 先按照年龄排序，如果年龄相同，再按照名字排序
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
}
