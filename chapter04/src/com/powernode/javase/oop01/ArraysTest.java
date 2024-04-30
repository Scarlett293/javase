package com.powernode.javase.oop01;

/**
 * time :2024/4/13 15:06 18
 * ClassName :ArraysTest
 * Package :com.powernode.javase.oop01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 测试数组工具类java.util.Arrays
 * 测试用例
 */
public class ArraysTest {

    @Test
    public void testAsList() {
        // 将遗传数字转换成List集合
        List list = Arrays.asList(1,2,3,4,5,6,7,7,8,8);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void testCopyOf() {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(newArr));

        int[] newArr2 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(newArr2));


    }

    @Test
    public void testFill() {
        int[] arr = new int[5]; // 5个0
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));

        // 不包含toIndex
        Arrays.fill(arr, 1, 3, 100);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testBinarySearch() {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.binarySearch(arr, 5));
    }


    /**
     * 启动多核CPU并行排序
     * 首先你的电脑是支持多核的
     * 注意：数据量太小的话，不要调用这个方法，因为启动多核也是要消耗资源的
     * JAVA8引入的方法
     * 数据量较大的时候，建议使用这个方法效率比较高
     * 通过原码分析，如果超过4096个长度，则会启用多核
     * 4096以内就自动调用sort方法
     */
    @Test
    public void testParallelSort() {
        int[] arr = new int[100000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(10000000);
            arr[i] = num;
        }

        // 获取系统当前时间的毫秒数 (1970-01-01 0:0:0 000 到当前系统时间的总毫秒数 1秒=1000毫秒)
        long begin = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();

        System.out.println(end - begin);
    }

    @Test
    public void testSort() {
        int[] arr = {1, 3, 45, 5, 6, 7, 87, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] strs = {"a", "ac", "ab", "b"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));


        // 能不能对Person数组排序
        Person p1 = new Person(20);
        Person p2 = new Person(19);
        Person p3 = new Person(17);
        Person p4 = new Person(18);

        /**
         * java.lang.ClassCastException: class com.powernode.javase.oop01.Person cannot be cast to class java.lang.Comparable
         * 猜测，底层一定有这样一行代码：
         *  Comparable comparable = (Comparable)p1; 为什么会报这样的错误呢？也进一步说明了我们的Person类是不可比较的
         *  Comparable字面意思，可比较的
         *
         */
        Person[] persons = {p1,p2,p3,p4};
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }

    @Test
    public void testEquals() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.equals(arr1, arr2));

        String[] names1 = {"abc", "def", "xyz"};
        String[] names2 = {"abc", "def", "xyz"};
        System.out.println(Arrays.equals(names1, names2));
    }


    /**
     * Arrays.toString()方法的作用：将数组对象转换成字符串形式
     */
    @Test
    public void testToString() {
        int[] arr = {1, 2, 3, 34, 54};
        System.out.println(arr); // [I@3d3fcdb0
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 34, 54]

        String[] names = {"zhangsan", "lisi", "wangwu"};
        System.out.println(names); //  [Ljava.lang.String;@641147d0
        System.out.println(Arrays.toString(names)); // [zhangsan, lisi, wangwu]
    }


    /**
     * Arrays.deepToString()作用是：适合于将多维数组转换成字符串。
     */
    @Test
    public void testDeepToString() {
        // 适合于二维数组及多维数组
        int[][] arr = {
                {12, 3, 4, 5, 6},
                {1, 3, 5, 7, 9},
                {33, 44, 55, 66, 77}
        };

        System.out.println(Arrays.toString(arr)); // [[I@641147d0, [I@6e38921c, [I@64d7f7e0]
        System.out.println(Arrays.deepToString(arr)); // [[12, 3, 4, 5, 6], [1, 3, 5, 7, 9], [33, 44, 55, 66, 77]]
    }
}
