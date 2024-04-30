package com.powernode.jvase.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * ClassName: LambdaTest18
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 20:58
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest18 {
    public static void main(String[] args) {
        // List集合
        List<Integer> list = Arrays.asList(1, 3, 2, 5, 6, 3, 2, 2, 4, 5, 5, 2);
        // 遍历List集合，调用forEach方法
        // forEach方法的参数是一个函数式接口：
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer elt) {
                // elt 代表的就是集合中的每个元素
                System.out.println(elt);
            }
        });
        System.out.println("================");
        // Lambda改进
        list.forEach(elt -> System.out.println(elt));
        // 使用方法引用精简
        list.forEach(System.out::println);
    }
}
