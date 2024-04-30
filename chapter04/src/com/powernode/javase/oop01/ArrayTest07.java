package com.powernode.javase.oop01;

/**
 * time :2024/4/4 23:53 41
 * ClassName :ArrayTest0
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 知道要查数组中的哪个值，请返回这个值第一次出现处的下标
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = getIndex(arr, 11);
        System.out.println(index);


        int elt = 5;
        int index2 = findIndexByElt(arr, elt);
        System.out.println(elt + "在数组中的下标为" + index2);

    }

    /**
     * 从arr数组中查找elt元素的下标。（第一次出现处的下标）
     * @param arr 数组
     * @param elt 要查找的元素
     * @return 元素下标
     */
    public static int findIndexByElt(int[] arr, int elt) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elt) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) return i;
        }
        return -1;
    }
}
