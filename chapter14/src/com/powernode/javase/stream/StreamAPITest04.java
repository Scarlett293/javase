package com.powernode.javase.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest04
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 12:46
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest04 {
    public static void main(String[] args) {
        // 筛选出年龄大于20的学生对象
        // filter 属于中间操作，过度
        // forEach属于终止操作，遍历
        // filter和forEach都是Stream接口中的方法。
        // 由于Stream支持链式调用，所以可以一直”.“
        // 匿名内部类形式
        StudentService.getStudents().stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getAge() > 20;
            }
        }).forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });
        // Lambda表达式
        StudentService.getStudents().stream().filter(student -> student.getAge() > 20).forEach(System.out::println);
        // 筛选出字符串长度大于3的元素
        Stream<String> stream = Stream.of("zhangsan", "lisi", "wangwu", "abc");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        // 筛选出学生名字长度大于4的学生
        StudentService.getStudents().stream().filter(student -> student.getName().length() > 4).forEach(System.out::println);
    }
}
