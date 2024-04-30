package com.powernode.javase.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: StudentService
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 12:43
 * Author: Scalett
 * Version: 1.0
 */
public class StudentService {
    public static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("zhangsan", 20, "男"));
        studentList.add(new Student("lisi", 21, "女"));
        studentList.add(new Student("wangwu", 22, "男"));
        studentList.add(new Student("zhaoliu", 18, "女"));
        studentList.add(new Student("qianqi", 19, "男"));
        studentList.add(new Student("qianqi", 19, "男"));
        studentList.add(new Student("qianqi", 19, "男"));
        studentList.add(new Student("qianqi", 19, "男"));
        return studentList;
    }
}
