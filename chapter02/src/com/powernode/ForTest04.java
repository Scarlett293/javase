package com.powernode;

/**
 * time :2024/3/9 17:22 23
 * ClassName :ForTest04
 * Package :com.powernode
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ForTest04 {
    public static void main(String[] args) {

        for (int i = 0; i < 34; i++) {
            int y = 100 - i;
            if(i * 3 + y / 3 == 100) {
                System.out.println("大和尚有：" + i + "个");
                System.out.println("小和尚有：" + y + "个");
            }
        }
    }


}
