package com.powernode.javase.collection.hashmap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.hashmap
 * @ClassName: HashMapTest01
 * @Date: 2024/4/18 22:16 12
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap集合特点：Key是无序不可重复
 *      1. key无序：
 */
public class HashMapTest01 {
    public static void main(String[] args) {
/*        // 创建HashMap集合（以下代码中，key是JDK内置的类）
        Map<String, String> map = new HashMap<>();
        // 向HashMap集合中put: key + value
        map.put("111111112", "张三");
        map.put("111111113", "李四");
        map.put("111111114", "王五");
        map.put("111111115", "赵六");
        map.put("222222225", "钱七1");
        map.put("222222225", "钱七2");
        map.put("222222225", "钱七3");
        map.put("222222225", "钱七4");
        // 遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String idCard = entry.getKey();
            String name = entry.getValue();
            System.out.println(idCard + "=" + name);
        }*/

        // Map集合的key部分存储的是自定义的类型，会是怎么样的？
        Map<User, Integer> map = new HashMap<>();

        User user1 = new User("zhangsan", 20);
        User user2 = new User("lisi", 22);
        User user3 = new User("wangwu", 21);
        User user4 = new User("zhaoliu", 19);
        User user5 = new User("zhaoliu", 19);

        System.out.println(user4.equals(user5)); // true


        System.out.println(user4.hashCode() % 9);
        System.out.println(user5.hashCode() % 16);

        // 向Map集合中put: key + value
        map.put(user1, 110);
        map.put(user2, 111);
        map.put(user3, 112);
        map.put(user4, 113);
        map.put(user5, 114);

        Set<User> users = map.keySet();
        for (User user : users) {
            Integer value = map.get(user);
            System.out.println(user + "====>" + value);
        }
    }
}
