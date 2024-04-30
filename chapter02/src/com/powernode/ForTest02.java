package com.powernode;
/**
 * time :2024/3/9 17:04 53
 * ClassName :ForTest02
 * Package :com.powernode
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/*
*  1
* 121
* 12321
* 1234321
* 123454321
* */
public class ForTest02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
