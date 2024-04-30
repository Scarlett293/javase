package com.powernode.jvase.lambda;


import java.util.TreeSet;

/**
 * ClassName: LambdaTest19
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 21:13
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest19 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);
        treeSet.add(400);
        treeSet.add(5);
        // 遍历set集合
        treeSet.forEach(System.out::println);
    }
}
