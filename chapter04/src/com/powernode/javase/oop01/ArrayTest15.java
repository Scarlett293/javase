package com.powernode.javase.oop01;

/**
 * time :2024/4/13 14:11 55
 * ClassName :ArrayTest15
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.util.Arrays;

/**
 * 冒泡排序算法
 * <p>
 * 分析原理:
 */
public class ArrayTest15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

//    private static void bubbleSort(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                // 两个两个进行比较
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }


//    private static void bubbleSort(int[] arr) {
//        for (int i = arr.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.println("========");
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }


    /**
     * 冒泡算法优化
     * @param arr
     */

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                System.out.println("=====================");
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
    }
}
