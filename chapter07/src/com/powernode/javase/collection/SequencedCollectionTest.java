package com.powernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.SequencedCollection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: SequencedCollectionTest
 * @Date: 2024/4/17 15:55 25
 */
public class SequencedCollectionTest {
    public static void main(String[] args) {
        // 创建集合对象
        SequencedCollection sc = new ArrayList();

        sc.add(1);
        sc.add(2);
        sc.add(3);
        sc.add(4);


        // 头部添加
        sc.addFirst(0);

        // 尾部添加
        sc.addLast(0);
        
        // 遍历
        Iterator it = sc.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("======================");

        // 获取头
        System.out.println(sc.getFirst());
        // 获取尾
        System.out.println(sc.getLast());

        // 删除头
        sc.removeFirst();
        // 删除尾巴1
        sc.removeLast();


        SequencedCollection reversed = sc.reversed();
        it = reversed.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
