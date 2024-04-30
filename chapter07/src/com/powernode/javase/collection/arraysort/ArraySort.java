package com.powernode.javase.collection.arraysort;

import java.util.Arrays;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.arraysort
 * @ClassName: UserSort
 * @Date: 2024/4/18 11:17 54
 */
public class ArraySort {
    public static void main(String[] args) {
        User u1 = new User("abc", 20);
        User u2 = new User("bbc", 18);
        User u3 = new User("abb", 19);
        User u4 = new User("cbs", 5);
        User u5 = new User("cbs", 6);

        User[] users = {u1, u2, u3, u4, u5};

        // 排序
        // Arrays数组工具类在对User类型的数组进行排序的时候
        // 因为User对象不是可比较的，User没有实现
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));
    }
}
