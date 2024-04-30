package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: CollectionTest04
 * @Date: 2024/4/17 22:02 19
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合迭代过程中元素的删除问题
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        // 创建集合对象C
        Collection<String> names = new ArrayList<>();
        // 添加元素
        names.add("zhangsan");
        names.add("lisi");
        names.add("wangwu");
        names.add("zhaoliu");
        names.add("zhoubapi");
        // 迭代集合，删除集合中的某个元素
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if ("lisi".equals(name)) {
                // 删除元素（使用集合代的remove方法删除元素）
                names.remove(name);
                // it.remove();
                // 删除元素（使用迭代器的remove方法删除元素） modCount++ expectedModCound++
            }
            System.out.println(name);
        }
        System.out.println(names.size());

        System.out.println("================");
        Iterator<String> it2 = names.iterator();
        while (it2.hasNext()) {
            String name = it2.next();
            System.out.println(name);
        }
    }
}
