package com.powernode.javase.collection.hashmap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.hashmap
 * @ClassName: HashMapTest02
 * @Date: 2024/4/19 08:23 45
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap集合的key可以是null吗？ 可以key是null
 *      可以key是null，但肯定是只能有1个
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "zhangsan");
        map.put(null, "lisi");
        map.put(null, "wangwu");
        map.put(null, "zhaoliu");
        System.out.println(map.size());

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
