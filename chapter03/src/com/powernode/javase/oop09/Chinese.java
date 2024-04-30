package com.powernode.javase.oop09;

/**
 * time :2024/3/9 21:27 38
 * ClassName :Chinese
 * Package :com.powernode.javase.oop09
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Chinese {
    String idCard;

    String name;

    static String country = "中国";

    public Chinese(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

    public void display() {
        System.out.println("身份证号" + this.idCard + ", 姓名" + this.name + ", 国际" + Chinese.country);
    }
}
