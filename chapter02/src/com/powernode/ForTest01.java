package com.powernode;

/**
 * time :2024/3/9 16:14 17
 * ClassName :ForTest01
 * Package :com.powernode
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/*

   *********
    *******
     *****
      ***
       *
      ***
     *****
    *******
   *********

 */
public class ForTest01 {
    public static void main(String[] args) {
//        打印上半部分

        for (int i = 5; i >= 1; i--) {

            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }

//        打印下半部分

        for (int i = 2; i <= 4; i++) {
            // 打印空格
            // 打印*
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2 - 1; j++) {

            }
        }
    }
}
