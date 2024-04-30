package com.powernode.javase.student;

/**
 * time :2024/4/6 13:16 06
 * ClassName :Student
 * Package :com.powernode.javase.student
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 学生信息类
 *
 * @author Scarlet
 * @version 1.0
 * @since 1.0
 */
public class Student {

    /**
     * 学号
     */
    private int no;
    /**
     * 姓名
     */
    private String name;
    /**
     * 生日
     */
    private String bitrh;
    /**
     * 性别
     */
    private String gender;
    /**
     * 电话号
     */
    private String phone;

    public Student() {
    }

    public Student(int no, String name, String bitrh, String gender, String phone) {
        this.no = no;
        this.name = name;
        this.bitrh = bitrh;
        this.gender = gender;
        this.phone = phone;
    }

    public Student(String name, String bitrh, String gender, String phone) {
        this.name = name;
        this.bitrh = bitrh;
        this.gender = gender;
        this.phone = phone;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBitrh() {
        return bitrh;
    }

    public void setBitrh(String bitrh) {
        this.bitrh = bitrh;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "{" +
                "学号=" + no +
                ", 姓名='" + name + '\'' +
                ", 生日='" + bitrh + '\'' +
                ", 性别='" + gender + '\'' +
                ", 手机号='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof Student) {
            Student student = (Student) obj;
            // 如果学号一样，就表示是同一个学生
            return this.no == student.no;
        }
        return false;
    }
}
