package com.powernode.javase.stream;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

/**
 * ClassName: StreamAPITest17
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 22:20
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest17 {
    public static void main(String[] args) {
        // 需求 获得元素的个数
        // 可以使用reduce
        long count = StudentService.getStudents().stream().count();
        System.out.println("学生总数：" + count);
        // 也可以使用collect
        Long count2 = StudentService.getStudents().stream().collect(Collectors.counting());
        System.out.println("学生总数：" + count);
        // 需求 获得学生的平均年龄
        Double average = StudentService.getStudents().stream().collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(average);
        // 需求 获得最大年龄的学生
        Student student = StudentService.getStudents().stream().collect(Collectors.maxBy((s1, s2) -> s1.getAge() - s2.getAge())).get();
        System.out.println("最大年龄的学生：" + student);
        // 需求 获得所有学生的年龄之和
        Integer ageSum = StudentService.getStudents().stream().collect(Collectors.summingInt(Student::getAge));
        System.out.println("所有学生年龄的和：" + ageSum);
        // 需求 获得年龄的所有的信息
        DoubleSummaryStatistics collect = StudentService.getStudents().stream().collect(Collectors.summarizingDouble(Student::getAge));
        System.out.println(collect);

        System.out.println(collect.getAverage());
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getSum());
    }
}
