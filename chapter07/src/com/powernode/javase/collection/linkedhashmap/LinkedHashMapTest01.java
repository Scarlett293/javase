package com.powernode.javase.collection.linkedhashmap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.linkedhashmap
 * @ClassName: LinkedHashMapTest01
 * @Date: 2024/4/19 12:55 13
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap 是 HashMap集合的子类
 * LinkedHashMap几乎和HashMap集合的用法一样
 * 只不过LinkedHashMap集合可以保证元素的插入顺序（有序的）
 * LinkedHashMap集合是：有序不可重复
 * LinkedHashMap集合的key也需要同时重写hashCode + equals
 * LinkedHashMap集合的底层的数据结构是：哈希表 + 双向链表
 */
public class LinkedHashMapTest01 {
    public static void main(String[] args) {
        // 创建一个有序不可重复的Map集合
        Map<Integer, String> map = new LinkedHashMap<>();

        // 有序值得是，插入顺序和取出顺序一致
        map.put(100, "张三1");
        map.put(101, "张三2");
        map.put(5, "张三3");
        map.put(3000, "张三4");
        map.put(88, "张三5");
        map.put(66, "张三6");
        map.put(66, "张三X");
        map.put(null, null);

        // 遍历
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
