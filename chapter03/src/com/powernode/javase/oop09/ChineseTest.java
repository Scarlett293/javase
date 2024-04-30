package com.powernode.javase.oop09;

/**
 * time :2024/3/9 21:29 01
 * ClassName :ChineseTest
 * Package :com.powernode.javase.oop09
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chinese zhangsan = new Chinese("12312131133", "张三");
        Chinese lisi = new Chinese("12353421113", "李四");
        Chinese wangwu = new Chinese("12335235113", "王五");

        zhangsan.display();
        lisi.display();
        wangwu.display();


    }
}
