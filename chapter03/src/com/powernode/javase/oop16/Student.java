package com.powernode.javase.oop16;

/**
 * time :2024/3/11 19:30 18
 * ClassName :Student
 * Package :com.powernode.javase.oop16
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 学号
     */
    private String no;
    /**
     * 学生所选的一门课
     */
    private Course course;

    public Student() {

    }

    public Student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public Student(String name, String no, Course course) {
        this.name = name;
        this.no = no;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * 选课
     */

    public void selection(Course course) {
        this.course = course;
        System.out.println("选课成功，课程是：" + course.getName());
    }

    /**
     * 退课
     */

    public void cancel() {
        String courseName = this.getCourse().getName();
        this.setCourse(null);

        System.out.println("退课成功，所退课程是:" + courseName);
    }

    public void display() {
        if (this.getCourse() == null) {
            System.out.println("学号：" + this.getNo() + ", 姓名：" + this.getName() + ", 还未选课");
        } else {
            System.out.println("学号：" + this.getNo() + ", 姓名：" + this.getName() + ", 所选课程名称：" + this.getCourse().getName());
        }
    }
}
