package com.powernode.javase.oop03;

import java.util.Scanner;

/**
 * time :2024/4/5 18:10 52
 * ClassName :Test
 * Package :com.powernode.javase.oop03
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) {
        Hotel h1 = new Hotel(6, 10);

        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎使用酒店系统\n请输入不同的数字来选择对应的功能\n" +
                "[1]查看所有房间状态\n[2]预定房间\n[3]退房\n[0]退出系统");
        system:while (true) {
            System.out.print("请输入功能编号:");
            int num1 = sc.nextInt();
            switch(num1) {
                case 1:
                    h1.display();
                    break;
                case 2:
                    System.out.print("请输入预定的房间号:");
                    int num2 = sc.nextInt();
                    h1.order(num2);
                    break;
                case 3:
                    System.out.print("请输入要退房的房间号:");
                    int num3 = sc.nextInt();
                    h1.exit(num3);
                    break;
                case 0:
                    System.out.println("感谢使用，下次再见！");
                    break system;
            }

        }
    }
}
