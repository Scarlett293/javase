package com.powernode.javase.collection.treemap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.treemap
 * @ClassName: TreeMapTest02
 * @Date: 2024/4/19 20:14 01
 */

import java.util.Map;
import java.util.TreeMap;

/**
 * 定义key是自定义类型的，能排序嘛？
 */
public class TreeMapTest02 {
    public static void main(String[] args) {
        // 创建Map集合
        Map<Person, String> persons = new TreeMap<>();

        // 添加
        Person p1 = new Person("bbc", 20);
        Person p2 = new Person("abc", 19);
        Person p3 = new Person("bbb", 5);
        Person p4 = new Person("ccc", 25);
        Person p5 = new Person("aaa", 25);

        // 添加
        // ClassCastException
        persons.put(p1, "1");
        persons.put(p2, "2");
        persons.put(p3, "3");
        persons.put(p4, "4");
        persons.put(p5, "5");

        System.out.println(persons);
    }
}
