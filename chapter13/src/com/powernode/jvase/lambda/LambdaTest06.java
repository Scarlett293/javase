package com.powernode.jvase.lambda;

/**
 * ClassName: LambdaTest06
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 18:56
 * Author: Scalett
 * Version: 1.0
 */
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(Integer value1, Integer value2);
}

public class LambdaTest06 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        MoreParameterNoReturn mpnr = new MoreParameterNoReturn() {
            @Override
            public void test(Integer value1, Integer value2) {
                System.out.println(value1 + value2);
            }
        };
        mpnr.test(1000, 2000);
        // Lambda表达式方式
       /* MoreParameterNoReturn mpnr2 = (Integer value1, Integer value2) -> {
            System.out.println(value1 + value2);
        };*/
        MoreParameterNoReturn mpnr2 = (value1, value2) -> System.out.println(value1 + value2);
        mpnr2.test(2000, 4000);
    }
}
