package com.powernode.javase.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * ClassName: StreamAPITest15
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 19:20
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest15 {
    public static void main(String[] args) {
        ArrayList<Student> students = StudentService.getStudents().stream()
                .filter(student -> student.getGender().equals("女"))
                .filter(student -> student.getAge() > 20)
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(students);
    }
}
