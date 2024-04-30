package com.powernode.javase.oop06;

/**
 * time :2024/3/9 19:16 57
 * ClassName :UserTest01
 * Package :com.powernode.javase.oop06
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class UserTest01 {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setUsername("2936900025");
        u1.setBalance(50000);
        u1.withdrawal(30000);

    }
}
