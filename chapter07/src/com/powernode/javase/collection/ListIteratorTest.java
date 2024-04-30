package com.powernode.javase.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: ListIteratorTest
 * @Date: 2024/4/18 09:59 37
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // 添加元素
        names.add("zhangsan");
        names.add("lisi");
        names.add("wangwu");
        names.add("zhaoliu");
/*
        // 使用ListIterator进行遍历
        ListIterator<String> li = names.listIterator();
        System.out.println("光标当前指向的位置上一个位置是否有元素：" + li.hasPrevious());



        while(li.hasNext()) {
            String s = li.next();
            System.out.println(s);
        }

        System.out.println("=============");
        System.out.println(li.previous());
        System.out.println(li.previous());
        System.out.println(li.previous());
        System.out.println(li.previous());


        System.out.println("===============");*/


        ListIterator<String> li = names.listIterator();

        // set方法不能随意使用，set调用的前提是：之前调用了next()活着previous()
/*        while(li.hasNext()) {
            String name = li.next();
            if("lisi".equals(name)) { // 当前取出的元素是"lisi"
                // System.out.println(li.nextIndex());
                // System.out.println(li.previousIndex());
                // 在这里可以调用set方法
                li.set("李四");
            }
            System.out.println(name);
        }
        System.out.println(names);*/


        // remove方法 通过迭代器去删除
        // li.remove(); // java.lang.IllegalStaticException（调用迭代器的remove方法之前也是需要调用next()/previous()方法。）
        // 删除上一次next()方法返回的那个数据（删除的是集合中的）。remove()方法调用的前提是：你先调用next()方法，不然会报错
        while (li.hasNext()) {
            String name = li.next();
            if ("lisi".equals(name)) {

                li.remove();
            }
            System.out.println(name);
        }
        System.out.println(names);


    }
}
