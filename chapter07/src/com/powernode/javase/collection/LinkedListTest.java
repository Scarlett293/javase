package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: LinkedListTest
 * @Date: 2024/4/18 17:57 33
 */

import java.util.LinkedList;

/**
 * LinkedList集合底层就是一个双向链表的数据接哦古
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();


        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");



        // 修改
        ll.set(1, "110");

        // 删除
        String removeValue = ll.remove(1); // removeValue: "110"
        System.out.println(removeValue); // 110 removeValue:"110"

        // 根据下标查询元素
        String s = ll.get(ll.size() - 1);  // li: size = 4
        System.out.println(s);
    }
}
