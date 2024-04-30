package com.powernode.javase.oop01;

/**
 * time :2024/4/13 14:47 15
 * ClassName :ArrayTest17
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 线性查找算法
 */
public class ArrayTest17 {
    public static void main(String[] args) {
        int[] arr = {102, 3, 4, 54, 343, 531, 3434, 67, 4333};
        // 找出以上数组中67元素的下标（67元素第一次出现处的下标）
        int num = 67;
        int index = search(arr, num);
        System.out.println(index >= 0 ? num + "第一次出现处的索引是" + index : "对不起，没有这个数据");
    }

    private static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) return i;
        }
        return -1;
    }
}
