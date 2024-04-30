package com.powernode.javase.collection;

/**
 * time :2024/4/15 22:37 35
 * ClassName :CollectionTest01
 * Package :com.powernode.javase.collection
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * （在不使用泛型的情况下）集合可以存储任何类型的引用，只要Object类的子类型
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection c = new ArrayList();
        // 添加元素
        c.add(1);
        c.add("abc");
        c.add(new Object());
        c.add(new Animal());
        // 遍历
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
class Animal {

}
