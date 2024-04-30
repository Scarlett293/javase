package com.powernode.javase.oop01;

/**
 * time :2024/4/5 17:48 47
 * ClassName :ArrayTest13
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 二维数组的静态初始化
 */
public class ArrayTest13 {
    public static void main(String[] args) {
        // 静态初始化二维数组的第一种方式
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6, 7, 8},
                {1, 1, 1, 1, 1, 1}
        };

        System.out.println("这二维数组当中有" + arr.length + "个一维数组"); // 3，表示里面有三个一维数组

        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);


        // 我要找二维数组中第一个一维数组中的第一个元素
        System.out.println(arr[0][0]);

        int[] arr0 = arr[0];
        int arr00 = arr0[0];
        System.out.println(arr00);


        // 最后一个一维数组
        // arr[arr.length-1]
        // 最后一个一维
        // 最后一个一维数组的最后一个元素
        System.out.println("最后一个一维数组的最后一个元素是：" + arr[arr.length - 1][arr[arr.length - 1].length - 1]);


        int[][] arr2 = {
                {1,2,3},
                {4,5,6,7,8},
                {1,1,1,1,1,1,1}
        };
        // 访问第二个一维数组的第二个元素
        System.out.println(arr2[1][1]);
    }
}
