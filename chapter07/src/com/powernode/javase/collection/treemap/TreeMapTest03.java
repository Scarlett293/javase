package com.powernode.javase.collection.treemap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.treemap
 * @ClassName: TreeMapTest03
 * @Date: 2024/4/19 20:41 20
 */

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 使用比较器的方式完成排序
 */
public class TreeMapTest03 {
    public static void main(String[] args) {
        /*// 创建一个比较器对象
        UserComparator comparator = new UserComparator();
        // 创建TreeMap集合的时候，可以给构造方法传递一个比较器
        Map<User, String> map = new TreeMap<>(comparator);
*/

        Map<User, String> map = new TreeMap<>(new UserComparator());
        User user1 = new User("zhangsan1", 20);
        User user2 = new User("zhangsan2", 2);
        User user3 = new User("zhangsan3", 10);
        User user4 = new User("zhangsan4", 18);
        User user5 = new User("zhangsan5", 9);

        map.put(user1, "1");
        map.put(user2, "2");
        map.put(user3, "3");
        map.put(user4, "4");
        map.put(user5, "5");

        System.out.println(map);

        // 匿名内部类方式
        Map<User, Integer> map2 = new TreeMap<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        map2.put(user1, 1);
        map2.put(user2, 1);
        map2.put(user3, 1);
        map2.put(user4, 1);
        map2.put(user5, 1);

        System.out.println(map2);
    }
}
