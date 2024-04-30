package com.powernode.jvase.lambda;

import java.util.function.Consumer;

/**
 * ClassName: LambdaTest11
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 19:58
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest11 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        // 使用消费型的函数式接口
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("动力节点");
        // 修改为Lambda表达式
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("动力节点");
        // 使用 实例方法引用 精简
        Consumer<String> consumer2 = System.out::println;
        consumer1.accept("动力节点");
    }
}
