package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: MyLinkedTest
 * @Date: 2024/4/18 18:55 55
 */
public class MyLinkedTest {
    public static void main(String[] args) {
        // 创建一个单向链表对应的集合对象
        MyLinked<String> myLinked = new MyLinked<>();
        // 添加元素
        myLinked.add("zhangsan");
        myLinked.add("lisi");
        myLinked.add("wangwu");
        myLinked.add("zhaoliu");

        // 在指定位置添加元素
        myLinked.add(1, "李四");

        // 遍历
        for (int i = 0; i < myLinked.size() - 1; i++) {
            System.out.println(myLinked.get(i));
        }

        // 删除下标位置i上的元素
        myLinked.remove(1);

        System.out.println("===============");


        // 遍历
        for (int i = 0; i < myLinked.size() - 1; i++) {
            System.out.println(myLinked.get(i));
        }

        System.out.println("===============");

        // 修改
        myLinked.set(1, "李四2");

        // 遍历
        for (int i = 0; i < myLinked.size() - 1; i++) {
            System.out.println(myLinked.get(i));
        }
    }
}
