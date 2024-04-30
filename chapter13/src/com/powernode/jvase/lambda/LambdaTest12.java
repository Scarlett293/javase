package com.powernode.jvase.lambda;

import java.util.function.Function;

/**
 * ClassName: LambdaTest12
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 20:05
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest12 {
    public static void main(String[] args) {
        // 匿名内部类方式
        // 使用转换型函数式接口
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function.apply(3.14));
        // Lambda表达式
        Function<Double, Long> function2 = value -> Math.round(value);
        System.out.println(function2.apply(5.67));
        // 静态方法引用
        Function<Double, Long> function3 =  Math::round;
        System.out.println(function2.apply(5.67));
    }
}
