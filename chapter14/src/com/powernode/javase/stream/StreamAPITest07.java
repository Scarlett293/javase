package com.powernode.javase.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest07
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 13:26
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest07 {
    public static void main(String[] args) {
        // 需求：对元素执行“升序”排序
        Stream.of(1, 2, 3, 4, 100, 0, -1).sorted().forEach(System.out::println);
        Stream.of("ccc", "bbb", "abc", "aaa").sorted().forEach(System.out::println);
        // 需求：按照学生的年龄执行“升序”排序（排序后输出学生对象）
        // 注意：这里的排序是对学生对象进行排序，排序规则需要指定，Student实现java.lang.Comparable接口。
        StudentService.getStudents().stream().sorted().forEach(System.out::println);
        // 需求：按照学生的年龄执行“升序”排序（排序后输出学生年龄）
        StudentService.getStudents().stream().map(Student::getAge).sorted().forEach(System.out::println);

        // 需求：对元素执行“升序”排序
        Stream.of(10, 20, 30, 18, 15).sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).forEach(System.out::println);
        Stream.of(10, 20, 30, 18, 15).sorted(Integer::compareTo).forEach(System.out::println);
        // 需求：按照学生的年龄执行“降序”排序
        StudentService.getStudents().stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.compareTo(o1);
            }
        }).forEach(System.out::println);
        StudentService.getStudents().stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);
        // 需求：按照学生的年龄执行“升序”排序
        // 先映射，再排序
        StudentService.getStudents().stream().map(Student::getAge).sorted().forEach(System.out::println);
        StudentService.getStudents().stream().map(Student::getAge).sorted(Integer::compareTo).forEach(System.out::println);
    }
}
