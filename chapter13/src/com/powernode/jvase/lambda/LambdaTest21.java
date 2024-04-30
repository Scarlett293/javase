package com.powernode.jvase.lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * ClassName: LambdaTest21
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 21:21
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest21 {
    public static void main(String[] args) {
/*        // 创建List集合
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        // 删除 cc
        // 匿名内部类的方式
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "cc".equals(s);
            }
        });
        // 使用Lambda表达式方式
        list.removeIf(s -> "cc".equals(s));
        // 使用方法引用继续精简
        list.removeIf("cc"::equals);
        System.out.println(list);*/


        // Set集合中的元素再遍历过程中删除符合条件的元素
        Set<String> set = new HashSet<>();
        set.add("100");
        set.add("200");
        set.add("300");
        set.add("400");
        set.removeIf("300"::equals);
        System.out.println(set);
    }
}
