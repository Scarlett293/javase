package com.powernode.javase.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: StremAPITest13
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 18:57
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest13 {
    public static void main(String[] args) {
        // 将流Stream中的数据全部收集到一个集合中。
        // 收集为list集合。（具体是哪种list集合，在这里是不知道的）
        List<String> list = Stream.of("zhangsan", "lisi", "wangwu").collect(Collectors.toList());
        System.out.println(list);
        Set<String> set = Stream.of("zhangsan", "lisi", "wangwu").collect(Collectors.toSet());
        // 收集为Set集合。（具体是哪种Set集合，在这里是不知道的）
        System.out.println(set);
        // 收集为Map集合
        // 匿名内部类的方式
        Map<String, String> map = Stream.of("1:zhangsan", "2:lisi", "3:wangwu").collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.substring(0, s.indexOf(":"));
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.substring(s.indexOf(":") + 1);
            }
        }));
        map.forEach((k, v) -> System.out.println(k + "===>" + v));
        // Lambda表达式方式
        Map<String, String> map1 = Stream.of("1:zhangsan", "2:lisi", "3:wangwu")
                .collect(Collectors.toMap(s -> s.substring(0, s.indexOf(":")), s -> s.substring(s.indexOf(":") + 1)));
        // 遍历map集合
        map1.forEach((k, v) -> System.out.println(k + "===>" + v));
    }
}
