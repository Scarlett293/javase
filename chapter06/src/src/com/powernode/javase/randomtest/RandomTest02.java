package src.com.powernode.javase.randomtest;

import java.util.Random;

/**
 * time :2024/4/15 20:59 24
 * ClassName :RandomTest02
 * Package :src.com.powernode.javase.randomtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {-1, -1, -1, -1, -1};


        int index = 0;
        while(index < arr.length) {
            System.out.println("=====================");
            int num = r.nextInt(101);
            if(!contains(arr, num)) {
                arr[index++] = num;
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
