package com.powernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: CollectionTest02
 * @Date: 2024/4/17 15:12 41
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection c = new ArrayList();
        //添加元素
        c.add(100); // 自动装箱
        c.add(3.14); //
        c.add(false);
        c.add("jack");
        c.add(new Object());


        // 将集合转换成Object数组
        Object[] objs = c.toArray();
        for (Object obj : objs) {
            System.out.println(obj);
        }


        // 查看集合中元素的个数
        System.out.println("集合中元素的个数：" + c.size());

        // 在创建一个集合对象
        Collection c2 = new ArrayList();
        c.add("zhangsan");
        c.add("lisi");
        c.add("wangwu");
        // 一次添加多个，将一个集合中所有的元素添加到当前集合对象中
        c.addAll(c2);
        System.out.println("集合中元素个数：" + c.size());
        // 判断集合中是否包含某个元素
        System.out.println(c.contains(100)); // true
        System.out.println(c.contains(101)); // false
        System.out.println(c.contains("zhangsan")); // true

        String s = new String("zhangsan");
        System.out.println(c.contains(s)); // true
        Date d1 = new Date(2008, 8, 8);
        c.add(d1);
        Date d2 = new Date(2008, 8, 8);
        c.add(d2);
        System.out.println(c.contains(d2)); // true

        // 删除集合中的某个元素
        System.out.println(c.size());
        c.remove(d2);
        System.out.println(c.size());

        // 清空集合
        System.out.println(s.isEmpty()); // false
        c.clear();
        System.out.println(c.size()); // 0
        System.out.println(s.isEmpty()); // false
    }
}
