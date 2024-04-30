package com.powernode.jvase.lambda;

/**
 * ClassName: LambdaTest05
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 18:42
 * Author: Scalett
 * Version: 1.0
 */
@FunctionalInterface
interface OneParameterNoReturn {
    void test(Integer value);
}
public class LambdaTest05 {
    public static void main(String[] args) {
        // 匿名内部类方式
        OneParameterNoReturn opnr = new OneParameterNoReturn() {
            @Override
            public void test(Integer value) {
                System.out.println("Integer -->" + value);
            }
        };
        opnr.test(1000);
        // Lambda表达式方式
        // OneParameterNoReturn opnr2 = (Integer value) -> System.out.println("Integer -->" + value);
        OneParameterNoReturn opnr2 = value -> System.out.println("Integer -->" + value);
        opnr2.test(2000);
    }
}
