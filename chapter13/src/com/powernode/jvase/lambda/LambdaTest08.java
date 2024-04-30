package com.powernode.jvase.lambda;

/**
 * ClassName: LambdaTest08
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 19:06
 * Author: Scalett
 * Version: 1.0
 */
@FunctionalInterface
interface OneParameterHasReturn {
    Integer test(Integer value);
}

public class LambdaTest08 {
    public static void main(String[] args) {
        OneParameterHasReturn ophr = new OneParameterHasReturn() {
            @Override
            public Integer test(Integer value) {
                return value * 2;
            }
        };
        ophr.test(100);
        OneParameterHasReturn ophr2 = value -> value * 2;
        ophr2.test(200);
    }
}
