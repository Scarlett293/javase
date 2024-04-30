package com.powernode.javase.collection.set;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.set
 * @ClassName: HashSet
 * @Date: 2024/4/19 21:17 37
 */

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合底层特点：无序不可重复
 * 放在HashSet集合中的元素需要同时重写hashCode + equals
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        // 特点是无序不可重复
        set1.add(100);
        set1.add(100);
        set1.add(100);
        set1.add(100);
        set1.add(120);
        set1.add(99);
        set1.add(1);
        set1.add(100);
        set1.add(100);
        System.out.println(set1);

        Set<String> set2 = new HashSet<>();
        set2.add("abc");
        set2.add("bbc");
        set2.add("abc");
        set2.add("acc");
        set2.add("abb");
        set2.add("acc");
        System.out.println(set2);


        Set<Vip> vips = new HashSet<>();
        Vip vip1 = new Vip("1111111", "zhangsan", 20);
        Vip vip2 = new Vip("1111111", "zhangsan", 20);
        Vip vip3 = new Vip("1111111", "zhangsan", 20);
        Vip vip4 = new Vip("1111112", "zhangsan", 20);

        vips.add(vip1);
        vips.add(vip2);
        vips.add(vip3);
        vips.add(vip4);
        System.out.println(vips);
    }
}
