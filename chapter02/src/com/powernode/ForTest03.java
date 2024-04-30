package com.powernode;

/**
 * time :2024/3/9 17:18 52
 * ClassName :ForTest03
 * Package :com.powernode
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ForTest03 {
    public static void main(String[] args) {
        int now = 1;
        for (int i = 0; i < 9; i++) {
            // 前一天剩余的桃子 = 今天的桃子 + 1 * 2;
            now+=1;
            now*=2;
        }

        System.out.println(now);
    }
}
