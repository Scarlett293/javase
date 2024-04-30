package com.powernode.javase.oop38;

/**
 * time :2024/3/27 21:06 56
 * ClassName :Test
 * Package :com.powernode.javase.oop38
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address a = new Address("北京", "海定");

        User user1 = new User("李四", a);

        User user2 = (User)user1.clone();

        System.out.println(user1);
        System.out.println(user2);

        user2.getAddr().setCity("天津");
        System.out.println("====================");

        System.out.println(user1);
        System.out.println(user2);
    }
}
