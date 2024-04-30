package com.powernode.javase.oop01;


/**
 * time :2024/3/31 20:03 15
 * ClassName :ArrayTest01
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 1.静态初始化一维数组
 * 第一种方式：数据类型[] 变量名 = new 数据类型[]{元素1, 元素2, 元素3, ...};
 * <p>
 * 比如: int[] arr = new int[]{};
 * <p>
 * 第二种方式：数据类型[] 变量名 = {元素1, 元素2, 元素3, ...};
 * 比如：int[] arr = {1, 2, 3, 4, 5, 6};
 * <p>
 * 提醒：如果大家在创建数组对象的时候，提前知道数组中应该具体存储哪些元素，建议使用静态初始化
 */

public class ArrayTest01 {
    public static void main(String[] args) {
        // 静态初始化一维数组的第一种方式
        int[] arr = new int[]{100, 200, 300};
        String[] names = new String[]{"jack", "lucy", "tom"};

        // C/C++的风格 不建议的，知道就行，别人这样写能看懂就行
        // int nums[] = new int[]{100, 200, 300};

        // 静态初始化一维数组的第二种方式
        int[] nums = {200, 500, 66, 988};

        String[] citys = {"北京", "大连", "上海"};

//        Animal a1 = new Animal();
//        Animal a2 = new Animal();
//        Animal a3 = new Animal();
//        Animal[] animals = {a1, a2, a3, new Animal()};


//        读nums数组中的每一个元素
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        // 将nums数组中的每个盒子中的数据修改一下
        nums[0] = 110;
        nums[1] = 120;
        nums[2] = 119;
        nums[3] = 911;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);


        /**
         * java.lang.NullPointerException 空指针异常
         * java.lang.ClassCastException 类型转换异常
         * java.lang.ArrayIndexOutOfBoundsException 数组越界异常
         */

        System.out.println("末尾元素：" + nums[nums.length - 1]);

        // 遍历citys数组
        for (int i = 0; i < citys.length; i++) {
            System.out.println(citys[i]);
        }

        for (int i = citys.length - 1; i > 0; i--) {
            System.out.println(citys[i]);
        }

    }
}
