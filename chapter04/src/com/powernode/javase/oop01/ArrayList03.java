package com.powernode.javase.oop01;

/**
 * time :2024/4/4 19:39 09
 * ClassName :ArrayList03
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.util.Random;

/**
 * 一维数组的静态初始化：
 *      什么时候使用动态初始化一维数组呢？
 *          当创建数组时，不知道数组中具体有哪些元素，可以使用动态初始化
 *         语法格式
 *          数组类型[] 变量名 = new 数据类型[长度];
 *          动态初始化一维数组之后，数组长度确定，数组中存储的每个元素将采用默认值
 *          默认值：
 *             数据类型                 默认值
 *             ============================
 *             byte                     0
 *             short                    0
 *             int                      0
 *             lang                     0
 *             float                    0.0
 *             double                   0.0
 *             boolean                  false
 *             char                     \u0000
 *             引用数据类型               null
 */
public class ArrayList03 {

    public static void main(String[] args) {
        int[] nums = new int[4];

        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = new String[5];

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("====================");

        Object[] objs = new Object[5];

        for (Object obj : objs) {
            System.out.println(obj);
        }


        // 往 objs数组的第一个位置上放一个对象
        objs[2] = new Object();


        for (Object obj : objs) {
            System.out.println(obj);
        }

        double[] scores = new double[10];
        Random random = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = random.nextDouble(101);
        }

        // 遍历
        for (double score : scores) {
            System.out.println(score);
        }
    }
}
