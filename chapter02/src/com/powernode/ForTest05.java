package com.powernode;

/**
 * time :2024/3/9 17:28 23
 * ClassName :ForTest05
 * Package :com.powernode
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ForTest05 {
    public static void main(String[] args) {
        int scheme = 0;
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int y = 100 - i - j;
                if(y % 3 == 0) {
                    if(i * 5 + j * 3 + y / 3 == 100) {
                        scheme++;
                    }
                }
            }
        }
        System.out.println("一共有方案" + scheme + "种");
    }
}
