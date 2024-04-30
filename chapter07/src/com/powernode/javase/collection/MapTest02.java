package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: MapTest02
 * @Date: 2024/4/18 21:57 42
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合如何遍历？
 */
public class MapTest02 {
    public static void main(String[] args) {
        
        // 创建Map集合
        HashMap<Integer, String> maps = new HashMap<>();

        // 存放元素
        maps.put(1, "张三");
        maps.put(2, "李四");
        maps.put(3, "王五");
        maps.put(4, "赵六");

        // 遍历Map集合
        // 思路：获取Map集合的所有key，然后遍历每个Key获取value
/*        Set<Integer> keys = maps.keySet();
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            String value = maps.get(key);
            System.out.println(key + "=" + value);
        }*/
/*        Set<Integer> keys = maps.keySet();
        for (Integer key : keys) {
            System.out.println(key + "=" + maps.get(key));
        }*/

        // 遍历Map集合（第二种方式）
        // 这种方式效率较高，建议使用
/*        Set<Map.Entry<Integer, String>> entries = maps.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> next = it.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "=" + value);
        }*/

        // for-each
        for (Map.Entry<Integer, String> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
