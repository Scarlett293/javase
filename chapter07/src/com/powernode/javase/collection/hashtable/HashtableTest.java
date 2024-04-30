package com.powernode.javase.collection.hashtable;

import java.util.*;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.hashtable
 * @ClassName: HashtableTest
 * @Date: 2024/4/19 18:22 45
 */

public class HashtableTest {

    public static void main(String[] args) {
/*        Map<Integer, String> map = new HashMap<>();
        map.put(null, null);
        System.out.println(map.size());


        Map<Integer, String> map2 = new Hashtable<>();
        // java.lang.NullPointerException
        // map2.put(null, "zhangsan");*/

        // 遍历Hashtable
        // Map<Integer, String> map = new Hashtable<>();
/*        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            int k = entry.getKey();
            String value = entry.getValue();
            System.out.println(k + "=" + value);
        }*/


        // 在Hashtable中仍然保留着一些比较传统的方法，例如Hashtable中独有的迭代方式
        // Hashtable独有的传统的方法，就需要调用Hashtable来调用。
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "zhangsan");
        hashtable.put(2, "lisi");
        hashtable.put(3, "wangwu");
        hashtable.put(4, "zhaoliu");

        // 迭代
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println(key);
        }

        // 获取含有所有value的迭代器
        Enumeration<String> elements = hashtable.elements();
        while(elements.hasMoreElements()) {
            String value = elements.nextElement();
            System.out.println(value);
        }

    }
}
