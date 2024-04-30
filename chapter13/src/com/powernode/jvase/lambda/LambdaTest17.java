package com.powernode.jvase.lambda;

import java.util.Arrays;
import java.util.function.Function;

/**
 * ClassName: LambdaTest17
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 20:48
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest17 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        // 转换型函数式接口
        Function<Integer, int[]> function = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };
        int[] nums = function.apply(10);
        System.out.println(Arrays.toString(nums));
        // Lambda表达式
        Function<Integer, int[]> function1 = length -> new int[length];
        nums = function1.apply(20);
        System.out.println(Arrays.toString(nums));
        // 数组引用 精简
        Function<Integer, int[]> function2 = int[]::new;
        nums = function2.apply(30);
        System.out.println(Arrays.toString(nums));
    }
}
