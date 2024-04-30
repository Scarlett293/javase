package com.powernode.javase.oop01;

/**
 * time :2024/4/5 15:18 14
 * ClassName :ArrayTest11
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 关于方法的可变长度参数
 *      1. 语法格式
 *          数据类型...
 *      2. 在参数中，可变长度参数只能由一个，并且只能在参数的末尾出现
 *      3. 可变长度参数，可以当作数组来看待
 */
public class ArrayTest11 {

    public static void main(String[] args) {
        m1();

        m1(10);
        m1(10, 20);
        m1(10, 20, 30);

        m2();
        m2("abc");
        m2("abc", "def");

        m1(1,2,3,4,5,6);
    }


    /**
     * int... nums 是一个可变长度参数
     * @param nums
     */
    public static void m1(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void m2(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
