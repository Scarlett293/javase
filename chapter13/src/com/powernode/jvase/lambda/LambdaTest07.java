package com.powernode.jvase.lambda;

/**
 * ClassName: LambdaTest07
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 18:59
 * Author: Scalett
 * Version: 1.0
 */
interface NoParameterHasReturn {
    Integer test();
}

public class LambdaTest07 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        NoParameterHasReturn nphr = new NoParameterHasReturn() {
            @Override
            public Integer test() {
                return 300;
            }
        };
        nphr.test();
        NoParameterHasReturn nphr2 = () -> 500;
        nphr2.test();
    }
}
