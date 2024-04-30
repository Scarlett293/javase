package com.powernode.javase.collection.treemap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.treemap
 * @ClassName: TreeMapTest04
 * @Date: 2024/4/19 21:08 26
 */

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/**
 * 都是哪些集合不能添加null。哪些可以？？
 *
 * Hashtable的key和value都不能为null
 *
 */
public class TreeMapTest04 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        // java.lang.NullPointerException
        // TreeMap集合的key不能为null
        // map.put(null, "abc");

        // TreeMap集合的value可以是null
        map.put(1, null);

        Properties pro = new Properties();
        // pro.setProperty(null, "abc");
        // pro.setProperty("abc", null);


    }
}
