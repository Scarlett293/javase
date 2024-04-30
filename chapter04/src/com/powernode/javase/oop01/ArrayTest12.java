package com.powernode.javase.oop01;

/**
 * time :2024/4/5 16:45 27
 * ClassName :ArrayTest12
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.util.Random;

/**
 * 关于数组的扩容问题：
 *      1.数组的长度一旦确定不可变
 *      2.如果数组满了，想存储更多的数据，只能创建一个新的数组，将原数组中的数据拷贝到新数组当中，这样就可以完成扩容了
 *      3.怎么优化？减少扩容次数，建议预测数据量，创建一个容量差不多的数组
 *      4.扩容的时候需要使用到数组的拷贝，怎么拷贝？
 *          System.arraycopy()
 */
public class ArrayTest12 {
    public static void main(String[] args) {

//        int[] src = {1,2,3,4,5,6,7,8,9,0,98,7,3};
//        int[] dest = new int[src.length * 2];
//
//        System.arraycopy(src, 3, dest, 1, src.length - 3);
//
//        for (int num : dest) {
//            System.out.println(num);
//        }
    }
}
