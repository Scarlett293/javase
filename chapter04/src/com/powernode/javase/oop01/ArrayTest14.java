package com.powernode.javase.oop01;

/**
 * time :2024/4/5 18:03 15
 * ClassName :ArrayTest14
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 二维数组的动态初始化
 * 等长
 * int[][] arr = new int[3][4];
 * 不等长
 * int[][] arr = new int[3][];
 */
public class ArrayTest14 {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        // 遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }


        // 动态初始化一个二维数组：不等长
        int[][] nums = new int[3][];
        nums[0] = new int[]{1, 2, 3, 4};
        nums[1] = new int[]{2, 3, 4};
        nums[2] = new int[]{1, 1, 1, 1, 1, 1, 1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
