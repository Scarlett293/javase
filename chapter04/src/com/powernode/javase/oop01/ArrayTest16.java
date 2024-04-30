package com.powernode.javase.oop01;

/**
 * time :2024/4/13 14:32 23
 * ClassName :ArrayTest16
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.util.Arrays;

/**
 * 选择排序：
 * 核心原理：找出参与比较的这些数据中最小的，然后拿着这个最小的数据和参与比较的这对数据中最左边的元素交换位置
 * 优点：交换的次数比冒泡排序的少，执行效率比冒泡排序高。（冒泡排序中的元素每一次比完之后被交换，这个交换有时是没有必要的）
 * <p>
 * 原理：
 * 参与比较的数据：3，2，7，6，1
 */
public class ArrayTest16 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 6, 1, 100, 200, 80, 870};
        selectSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // 假设参与比较的这些数据中最左边的是最小的
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i) { // 说明有更小的值
                // 交换位置（拿着当下的最小值和参与比较的这些数据中最前面的值交换位置）
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
