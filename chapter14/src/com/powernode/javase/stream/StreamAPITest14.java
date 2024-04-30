package com.powernode.javase.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest14
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 19:12
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest14 {
    public static void main(String[] args) {
        // 注意:ArrayList::new 是构造方法引用
        // 以ArrayList集合进行收集
        ArrayList<String> arrayList = Stream.of("zhangsan", "lisi", "wangwu", "wangwu").collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);
        // 以LinkedList集合进行收集
        LinkedList<String> linkedList = Stream.of("zhangsan", "lisi", "wangwu", "wangwu").collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList);
        // 以hashSet集合收集
        HashSet<Integer> hashSet = Stream.of(1, 1, 1, 1, 100, 300, 200, 50, 50).collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashSet);
        // 以TreeSet集合收集
        TreeSet<Integer> treeSet = Stream.of(1, 1, 1, 1, 100, 300, 200, 50, 50).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);
    }
}
