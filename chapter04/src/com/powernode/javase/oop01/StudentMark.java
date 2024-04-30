package com.powernode.javase.oop01;

import java.util.Scanner;

/**
 * time :2024/4/4 19:24 39
 * ClassName :StudentMark
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StudentMark {
    public static void main(String[] args) {
//        int[] marks = {50, 50, 60, 60, 70, 70, 70, 70, 80, 100};
//
//        int totalPoint = 0;
//        for (int mark : marks) {
//            totalPoint = totalPoint + mark;
//        }
//
//        System.out.println("这10个学生的成绩总分为：" + totalPoint);
//        System.out.println("这10个学生的成绩平均分为：" + totalPoint / 10);


        double[] scores = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩");
            double score = scanner.nextDouble();
            scores[i] = score;
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println("学生" + (i + 1) + "的成绩是：" + scores[i]);
            sum += scores[i];

        }

        System.out.println("总分：" + sum);
        System.out.println("平均分：" + sum / (scores.length - 1));



    }
}
