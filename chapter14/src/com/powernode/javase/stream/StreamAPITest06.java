package com.powernode.javase.stream;

import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest06
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 13:18
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest06 {
    public static void main(String[] args) {
        // 除去重复的元素
        Stream.of(1,1,1,1,1,1,1,2).distinct().forEach(System.out::println);
        // 去除重复的学生
        // 去除重复记录是基于 hashCode + equals 方法的。 记得重写
        StudentService.getStudents().stream().distinct().forEach(System.out::println);
        // 需求：去除年龄相同的学生（除重后输出学生年龄）
        // 思路：先映射，后去重
        StudentService.getStudents().stream().map(Student::getAge).distinct().forEach(System.out::println);
    }
}
