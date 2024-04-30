package com.powernode.javase.oop01;

/**
 * time :2024/4/4 19:46 33
 * ClassName :ArrayList04
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ArrayList04 {

    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4};

        display(nums);


//        display({1, 2, 3, 4}); // 这是错误的
        display(new int[]{1, 2, 3, 4}); // 这是正确的

        display(new int[10]);


    }


    /**
     * 遍历一维数组
     * @param arr
     */
    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
