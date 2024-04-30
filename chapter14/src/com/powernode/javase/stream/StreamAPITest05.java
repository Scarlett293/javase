package com.powernode.javase.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest05
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 13:00
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest05 {
    public static void main(String[] args) {
        // 把字符串的每个字母转换成大写
        // 匿名内部类的方式
        Stream.of("abc", "def", "xyz").map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);
        // Lambda表达式
        Stream.of("abc", "def", "xyz").map(String::toUpperCase).forEach(System.out::println);
        // 获取集合中所有学生的名字
        StudentService.getStudents().stream().map(Student::getName).forEach(System.out::println);
        // 需求：获取集合中性别为男的学生名字
        // 思路：先筛选，后映射
        StudentService.getStudents().stream().filter(s -> s.getGender().equals("男")).map(Student::getName).forEach(System.out::println);


        // 将多个集合中的数据合并到一个Stream当中
        // flatMap的方法作用是什么？将多个集合中的所有元素全部放到一个stream中。
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        Stream<List<Integer>> twoListStream = Stream.of(list1, list2);
        // 匿名内部类方式
        twoListStream.flatMap(new Function<List<Integer>, Stream<?>>() {
            @Override
            public Stream<?> apply(List<Integer> integers) {
                return integers.stream();
            }
        }).forEach(System.out::println);
        // Lambda表达式
        twoListStream.flatMap(List<Integer>::stream).forEach(System.out::println);

    }
}
