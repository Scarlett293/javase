package com.powernode.javase.oop01;

/**
 * time :2024/4/5 14:25 55
 * ClassName :ArrayTest08
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 数组的反转
 * 第一种方式：创建一个鑫数组
 * 第二种方式：首尾交换
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 反转
//        reverse(arr);
//
//        System.out.println("反转后的数组结果为");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        reverse2(arr);
        System.out.println("反转后的数组结果为");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    /*
    0和8交换
    1和7交换
    2 6
    3 5
    4 4
     */

    /**
     * 这种方式完成的数组反转，不但效率高（循环次数少），而且还很节省空间，因为不需要new新的数组对象
     * @param arr
     */
    public static void reverse(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            num = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = num;
        }
    }

    public static void reverse2(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = arr.length, j = 0; i > 0; i--, j++) {
            newArr[j] = arr[i-1];
        }
        arr = newArr;
    }
}
