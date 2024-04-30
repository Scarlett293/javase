package com.powernode.javase.stream;

import java.util.stream.Collectors;

/**
 * ClassName: StreamAPITest19
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 22:33
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest19 {
    public static void main(String[] args) {
        // 需求 将所有学生的姓名连接成一个字符串，每个名字之间以”,“连接
        String s = StudentService.getStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(","));
        System.out.println(s);
    }
}
