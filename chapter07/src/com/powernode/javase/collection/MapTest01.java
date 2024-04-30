package com.powernode.javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: MapTest01
 * @Date: 2024/4/18 21:21 33
 */
public class MapTest01 {
    public static void main(String[] args) {
        // 创建一个Map集合
        Map<Integer, String> maps = new HashMap<>();

        // 添加键值对
        maps.put(120, "张三");
        maps.put(110, "李四");
        maps.put(119, "王五");
        System.out.println("键值对个数：" + maps.size());

        // 根据key获取value
        String s = maps.get(110);
        System.out.println(s);

        // key对应的valueu存在的时候返回null
        System.out.println(maps.get(1111)); // null

        // 清空maps
        // maps.clear();
        // System.out.println("个数：" + maps.size());

        // 判断集合中是否包含某个key
        System.out.println(maps.containsKey(110));

        // 判断集合中是否包含某个value
        System.out.println(maps.containsValue("张三"));


        // 判断集合是否为空（判断键值对的个数是否为0）
        System.out.println(maps.isEmpty()); // false


        // 再创建一个Map集合
        Map<Integer, String> newMaps = new HashMap<>();
        newMaps.put(111, "赵六");
        newMaps.putAll(maps);
        System.out.println("键值对个数：" + newMaps.size());


        // 通过key删除整个key-value对儿
        newMaps.remove(111);
        System.out.println(newMaps.size());

        // 获取所有的value
        Collection<String> values = maps.values();
        // for-each迭代集合。
        for (String value : values) {
            System.out.print(value + ",");
        }

        // 静态方法of
        Map<Integer, String> userMap = Map.of(1, "zhangsan", 2, "lisi", 3, "wangwu", 4, "zhaoliu");
        System.out.println(userMap.size());
    }
}
