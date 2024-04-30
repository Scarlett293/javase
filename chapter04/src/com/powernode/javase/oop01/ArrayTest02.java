package com.powernode.javase.oop01;

/**
 * time :2024/4/4 19:06 13
 * ClassName :ArrayTest02
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 增强for循环/for-each循环。JDK5的鑫特性
 *
 *
 * for each语法结构
 *      for(数据中元素的数据类型 变量名 : 数组名) {
 *
 *      }
 *
 *
 * for each的优点：代码简洁，可读性强
 *
 * for each的缺点：没有下标
 */
public class ArrayTest02 {

    public static void main(String[] args) {

        // 静态初始化一维数组

        int[] arr = {100, 200, 300};

        String[] names = {"jack", "lucy", "tom"};

        // 遍历arr数组(for-each)
        for (int num : arr) {
            System.out.println(num); // 代表数组中的每个元素
        }

        for (String name : names) {
            name = "111";
            System.out.println(name);
        }



        for (String name : names) {
            System.out.println(name);
        }
    }
}
