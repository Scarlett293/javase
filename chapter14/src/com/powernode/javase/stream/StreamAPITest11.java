package com.powernode.javase.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest11
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 14:08
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest11 {
    public static void main(String[] args) {
        // 将集合中的所有数字求和
        System.out.println(Stream.of(1, 2, 3, 4).reduce((x, y) -> x + y).get());
        // 使用数学工具类
        System.out.println(Stream.of(1, 2, 3, 4).reduce(Math::addExact).get());
        // 需求：获得集合中所有元素”相乘“的结果
        System.out.println(Stream.of(1, 2, 3, 4).reduce(Math::multiplyExact).get());
        // 获取最大长度的 元素
        System.out.println(Stream.of("abc", "def", "hello", "helloworld").reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get());
        // 获得所有学生的总年龄
        System.out.println(StudentService.getStudents().stream().map(Student::getAge).reduce(Math::addExact).get());
        // 获得10和集合中所有元素”相加“的结果
        System.out.println(Stream.of(1, 2, 3, 4).reduce(10, Math::addExact));
    }
}
