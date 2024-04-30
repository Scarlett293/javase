package com.powernode.jvase.lambda;

import java.util.Comparator;

/**
 * ClassName: LambdaTest13
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 20:14
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest13 {
    public static void main(String[] args) {
        // 匿名内部类
        Comparator<Double> comparator = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(3.14, 5.6));
        // Lambda表达式
        Comparator<Double> comparator2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator.compare(3.14, 5.6));
        // 特殊方法引用
        Comparator<Double> comparator3 = Double::compareTo;
        System.out.println(comparator3.compare(3.14, 5.6));
    }
}
