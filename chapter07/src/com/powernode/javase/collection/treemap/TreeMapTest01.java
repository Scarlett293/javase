package com.powernode.javase.collection.treemap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.treemap
 * @ClassName: TreeMapTest01
 * @Date: 2024/4/19 20:02 53
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * java.util.TreeMap
 * 1. TreeMap集合的key部分是可排序的。（但不可重复）
 * 2. TreeMap集合的key也需要重写hashCode + equals。
 * 3. TreeMap集合底层采用了红黑二叉树
 */
public class TreeMapTest01 {
    public static void main(String[] args) {
        // 创建一个TreeMap集合
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(100, "zhangsan");
        map.put(101, "李四");
        map.put(102, "wangwu");
        map.put(99, "赵六");
        map.put(88, "qianqi");

        // 遍历
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            int key = entry.getKey();
            String value = entry.getValue();;
            System.out.println(key + "=" + value);
        }


        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("abc", 1);
        map2.put("bbc", 2);
        map2.put("abb", 3);
        map2.put("acc", 4);
        map2.put("ccc", 5);
        map2.put("bbb", 6);

        System.out.println(map2);
    }
}
