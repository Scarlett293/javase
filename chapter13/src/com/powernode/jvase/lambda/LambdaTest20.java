package com.powernode.jvase.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * ClassName: LambdaTest20
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 21:15
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest20 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jack");
        map.put(2, "lucy");
        map.put(3, "wangwu");
        map.put(4, "zhangsan");
        map.put(5, "lisi");
        // 遍历
        // 匿名内部类方式
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key + "=" + value);
            }
        });
        // 使用Lambda表达式改进
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
