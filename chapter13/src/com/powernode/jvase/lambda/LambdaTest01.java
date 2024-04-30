package com.powernode.jvase.lambda;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * ClassName: LambdaTest01
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 13:49
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest01 {
    public static void main(String[] args) {
        // TreeSet集合中的元素是可以自动排序的
        // TreeSet集合是怎么排序的？两种方式
        // 第一种方式：如果比较规则固定不变，可以让TreeSet集合中的元素实现java.lang.Comparable接口。
        // 第二种方式：创建TreeSet集合的时候，给TreeSet集合传递一个比较器对象，比较器实现：java.util.Comparable接口。

        // 以下是匿名内部类的方式
        TreeSet<User> users = new TreeSet<>(new Comparator<User>(){
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // TreeSet<User> users1 = new TreeSet<>((User o1, User o2) -> {return o1.getAge() - o2.getAge();});
        TreeSet<User> users1 = new TreeSet<>((o1, o2) -> o2.getAge() - o1.getAge());


        User user1 = new User(20);
        User user2 = new User(30);
        User user3 = new User(40);
        User user4 = new User(10);

        users1.add(user1);
        users1.add(user2);
        users1.add(user3);
        users1.add(user4);

        System.out.println(users1);
    }
}


class User {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
