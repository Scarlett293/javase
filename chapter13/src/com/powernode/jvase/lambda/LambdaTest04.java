package com.powernode.jvase.lambda;

/**
 * ClassName: LambdaTest04
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 18:36
 * Author: Scalett
 * Version: 1.0
 */
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
public class LambdaTest04 {
    public static void main(String[] args) {
        // 匿名内部类方式
        NoParameterNoReturn npnr = new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("无返回值无参数的test方法执行了。");
            }
        };
        npnr.test();
        // 改成Lambda表达式
        NoParameterNoReturn npnr2 = () -> {
            System.out.println("无返回值无参数的test执行了。");
        };

        // 精简
        NoParameterNoReturn npnr3 = () -> System.out.println("无返回值无参数的test执行了。");

        npnr2.test();
    }
}
