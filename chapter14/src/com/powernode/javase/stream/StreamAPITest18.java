package com.powernode.javase.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ClassName: StreamAPITest18
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 22:32
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest18 {
    public static void main(String[] args) {
        // 按照性别分组
        Map<String, List<Student>> map = StudentService.getStudents().stream().collect(Collectors.groupingBy(Student::getGender));
        map.forEach((k,v) -> System.out.println(k + "===>" + v));
    }
}
