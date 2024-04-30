package com.powernode.javase.oop16;

/**
 * time :2024/3/11 19:30 25
 * ClassName :Course
 * Package :com.powernode.javase.oop16
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Course {
    private String name;
    private String teacher;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * 输出课程信息
     */

    public void display() {
        System.out.println("课程名称：" + this.getName() + ", 授课老师：" + this.getTeacher());
    }


}
