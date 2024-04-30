package com.powernode.jvase.lambda;

/**
 * ClassName: LambdaTest09
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 19:10
 * Author: Scalett
 * Version: 1.0
 */
@FunctionalInterface
interface MoreParameterHasReturn {
    Integer test(Integer value1, Integer value2);
}

public class LambdaTest09 {
    public static void main(String[] args) {
        // 匿名内部类
        MoreParameterHasReturn mpnr = new MoreParameterHasReturn() {
            @Override
            public Integer test(Integer value1, Integer value2) {
                return value1 + value2;
            }
        };
        mpnr.test(1, 2);
        //Lambda表达式的方式
        MoreParameterHasReturn mpnr2 = (value1, value2) -> value1 + value2;
        mpnr2.test(2, 3);
    }
}
