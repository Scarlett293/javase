package com.powernode.javase.collection.hashmap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.hashmap
 * @ClassName: MyHashMapTest
 * @Date: 2024/4/19 09:18 01
 */

/**
 * 测试自己编写的HashMap集合的方法
 */
public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("110", "张三");
        map.put("120", "李四");
        map.put("130", "王五");
        map.put("140", "赵六");
        map.put("110", "张三2");
        map.put(null, "钱七1");
        map.put(null, "钱七2");
        map.put(null, "钱七3");
        map.put(null, "钱七4");

        System.out.println(map);

        System.out.println(map.get(null));
        System.out.println(map.get("110"));
        System.out.println(map.get("120"));

        MyHashMap<User, String> userMap = new MyHashMap<>();
        User user1 = new User("张三", 20);
        User user2 = new User("李四", 22);
        User user3 = new User("王五", 23);
        User user4 = new User("王五", 23);
        userMap.put(user1, "110");
        userMap.put(user2, "120");
        userMap.put(user3, "130");
        userMap.put(user4, "abc");

        System.out.println(userMap);
    }
}
