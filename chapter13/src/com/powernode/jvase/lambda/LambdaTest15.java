package com.powernode.jvase.lambda;

import java.util.function.Supplier;

/**
 * ClassName: LambdaTest15
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 20:30
 * Author: Scalett
 * Version: 1.0
 */
class Bird {
}
public class LambdaTest15 {
    public static void main(String[] args) {
        // 匿名内部类方式
        // 使用生产型的函数式接口
        Supplier<Bird> supplier = new Supplier<Bird> () {
            @Override
            public Bird get() {
                return new Bird();
            }
        };
        System.out.println(supplier.get());
        // Lambda表达式
        Supplier<Bird> supplier1 = () -> new Bird();
        System.out.println(supplier1.get());
        // 构造方法引用精简
        Supplier<Bird> supplier2 = Bird::new;
        System.out.println(supplier2.get());
    }
}
