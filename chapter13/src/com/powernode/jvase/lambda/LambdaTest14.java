package com.powernode.jvase.lambda;

import java.util.function.Function;

/**
 * ClassName: LambdaTest14
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 20:18
 * Author: Scalett
 * Version: 1.0
 */
class Vip {
    private String name;
    public Vip(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class LambdaTest14 {
    public static void main(String[] args) {
        // 转换型的函数式接口
        // 匿名内部类
        Function<Vip, String> function = new Function<Vip, String>() {
            @Override
            public String apply(Vip vip) {
                return vip.getName();
            }
        };
        Vip vip = new Vip("老杜");
        System.out.println(function.apply(vip));
        // Lambda表达式形式
        // Function<Vip, String> function2 = (Vip v) -> v.getName();
        Function<Vip, String> function2 = v -> v.getName();
        System.out.println(function2.apply(vip));
        // 使用"特殊方法引用"来进行精简
        Function<Vip, String> function3 = Vip::getName;
        System.out.println(function2.apply(vip));

    }
}
