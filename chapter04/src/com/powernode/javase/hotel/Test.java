package com.powernode.javase.hotel;

import java.util.Scanner;

/**
 * time :2024/4/5 19:21 45
 * ClassName :Test
 * Package :com.powernode.javase.hotel
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("请通过选择对应的功能编号来使用对应的功能：");
        System.out.println("[1]查看酒店所有的房间状态");
        System.out.println("[2]预定房间");
        System.out.println("[3]退房");
        System.out.println("[0]退出系统");
        Scanner sc = new Scanner(System.in);

        // 获取功能编号

        while (true) {
            System.out.println("请输入功能编号：");
            int no = sc.nextInt();
            switch (no) {
                case 1 -> hotel.display();
                case 2 -> {
                    System.out.println("请输入预定的房间号");
                    int roomNo = sc.nextInt();
                    hotel.order(roomNo);
                    System.out.println("预定房间[" + roomNo + "]成功");
                }
                case 3 -> {
                    System.out.println("请输入要退房的房间号");
                    int roomNo = sc.nextInt();
                    hotel.exit(roomNo);
                    System.out.println("退房[" + roomNo + "]成功");
                }
                case 0 -> {
                    System.out.println("再见，欢迎下次使用！");
                    // 退出系统，终止JVM
                    System.exit(0);
                }
            }
        }
    }
}
