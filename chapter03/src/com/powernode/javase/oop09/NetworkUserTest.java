package com.powernode.javase.oop09;

/**
 * time :2024/3/9 21:05 21
 * ClassName :NetworkUserTest
 * Package :com.powernode.javase.oop09
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class NetworkUserTest {
    public static void main(String[] args) {
        NetworkUser networkUser = new NetworkUser("001", "123456", "2936900025@qq.com");

        networkUser.display();
    }
}
