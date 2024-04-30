package com.powernode.javase.oop01;

/**
 * time :2024/4/4 22:37 59
 * ClassName :ArrayTest06
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

/**
 * 找最值
 */
public class ArrayTest06 {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int max = searchMax(arr);
        int min = searchMin(arr);
        int maxIndex = searchMaxIndex(arr);
        int minIndex = searchMinIndex(arr);
        System.out.println(max);
        System.out.println(min);
        System.out.println(maxIndex);
        System.out.println(minIndex);




    }

    public static int searchMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static int searchMaxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[maxIndex] < arr[i]) maxIndex = i;
        }
        return maxIndex;
    }

    public static int searchMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }
        return min;

    }

    public static int searchMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[minIndex] > arr[i]) minIndex = i;
        }
        return minIndex;
    }
}
