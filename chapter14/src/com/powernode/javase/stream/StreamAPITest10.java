package com.powernode.javase.stream;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest10
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 13:54
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest10 {
    public static void main(String[] args) {
        // 匹配集合中元素是否都是3
        System.out.println(Stream.of(1, 2, 3, 4).allMatch(value -> value.equals(3))); // false
        System.out.println(Stream.of(3, 3, 3, 3).allMatch(value -> value.equals(3))); // true
        // 匹配集合中元素是否包含3
        System.out.println(Stream.of(1, 2, 3, 4).anyMatch(value -> value.equals(3))); // true
        // 匹配集合中元素是否没有3
        System.out.println(Stream.of(1, 2, 3, 4).noneMatch(value -> value.equals(3))); // false
        System.out.println(Stream.of(1, 2, 3, 4).noneMatch(value -> value.equals(100))); // true
        // 获取流中第一个元素
        Optional<Integer> firstOptional = Stream.of(1,2,3,4).findFirst();
        System.out.println(firstOptional.get());
        // 需求；匹配学生姓名是否都为"zhangsan"
        boolean zhangsan = StudentService.getStudents().stream().allMatch(Student -> Student.getName().equals("zhangsan"));
        System.out.println(zhangsan); // false

        // 需求：获得第四个学生
        // 思路，跳过前面3个学生，然后再获取第一个元素
        System.out.println(StudentService.getStudents().stream().skip(3).findFirst());
    }
}
