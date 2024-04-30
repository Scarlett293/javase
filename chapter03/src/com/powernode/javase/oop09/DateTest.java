package com.powernode.javase.oop09;

/**
 * time :2024/3/9 21:17 10
 * ClassName :DateTest
 * Package :com.powernode.javase.oop09
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.display();

        Date d2 = new Date(2008, 8, 8);
        d2.display();
    }
}
