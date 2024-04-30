package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: ListTest01
 * @Date: 2024/4/18 08:17 26
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.List: 接口 （List 家族）
 *      1. List家族特点：有序可重复（有序：每个氧元素有下标，从0开始，以1递增。可重复：存储了一个1，还可以再重复一个1）
 */
public class ListTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);

        // 遍历
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }

    }
}
