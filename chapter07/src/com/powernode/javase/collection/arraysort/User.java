package com.powernode.javase.collection.arraysort;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.arraysort
 * @ClassName: User
 * @Date: 2024/4/18 11:17 31
 */
public class User implements Comparable<User>{
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
    public int compareTo(User user) { // 这个int是compareTo方法的返回值：相当于a - b之后的结果
        // 这里提供比较规则
        // 可以按照名字和年龄比较
        // return this.age - user.age; // this放前表示升序，this放后面表示降序

        return this.name.compareTo(user.name);
    }
}
