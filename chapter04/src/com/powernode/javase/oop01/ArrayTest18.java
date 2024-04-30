package com.powernode.javase.oop01;

/**
 * time :2024/4/13 14:49 49
 * ClassName :ArrayTest18
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 二分法查找 / 折半查找
 * 二分法查找是建立在排序的基础之上的
 * 二分法查找的原理
 * 从这里：1，2，3，4，5，6，7，8，9 找到7的下标
 * begin = 0;
 * end = 9;
 * mid = 4;
 * arr[mid] --> 80
 * 20
 * arr[=mid] > 20 ()
 */
public class ArrayTest18 {
    public static void main(String[] args) {
        int[] arr = {1, 20, 50, 77, 80, 99, 101, 256, 666, 888};
        int num = 888;
        int index = benarySearch(arr, num);
        System.out.println(num + "的下标是" + index);
    }

    private static int benarySearch(int[] arr, int num) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (num > arr[mid]) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
