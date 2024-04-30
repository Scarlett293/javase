package com.powernode.javase.stream;

/**
 * ClassName: StreamAPITest12
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 14:21
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest12 {
    public static void main(String[] args) {
        // 获取元素的个数
        System.out.println(StudentService.getStudents().stream().count());
        System.out.println(StudentService.getStudents().size());
        // 获取年龄最大的学生
        System.out.println(StudentService.getStudents().stream().max((s1, s2) -> s1.getAge() - s2.getAge()).get());
        // 获得学生的最大年龄
        System.out.println(StudentService.getStudents().stream().map(Student::getAge).max((Integer::compareTo)).get());
        // 获取年龄最小的学生
        System.out.println(StudentService.getStudents().stream().min((s1, s2) -> s1.getAge() - s2.getAge()).get());
        // 获得学生的最小年龄
        System.out.println(StudentService.getStudents().stream().map(Student::getAge).min((Integer::compareTo)).get());
    }
}
