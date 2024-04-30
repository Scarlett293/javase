package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: VectorTest01
 * @Date: 2024/4/18 17:22 03
 */

import java.util.List;
import java.util.Vector;

/**
 * Vector中所有的方法都有synchronized修饰，所有的方法都是线程安全的
 * 整体执行效率较低，已经很少使用了，因为现在保证线程安全有新手段。
 */
public class VectorTest01 {
    public static void main(String[] args) {
        // Vector底层也是一个数组：线程安全的数组
        List<String> list = new Vector<>();

        // 分析源码，看看怎么扩容的？扩容之后的容量是原容量的2倍
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
    }
}
