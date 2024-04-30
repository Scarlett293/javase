package com.powernode.javase.collection.set;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.set
 * @ClassName: LinkedHashSetTest
 * @Date: 2024/4/19 21:31 37
 */

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet集合特点：有序不可重复
 * 同样需要重写hashCode + equals
 * 有序：插入顺序有保障
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(100);
        set1.add(2);
        set1.add(300);
        set1.add(111);
        set1.add(222);

        for (Integer value : set1) {
            System.out.println(value);
        }
    }
}
