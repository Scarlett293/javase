package com.powernode.javase.student;

/**
 * time :2024/4/6 13:16 20
 * ClassName :StudentService
 * Package :com.powernode.javase.student
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 学生业务类
 */
public class StudentService {
    /**
     * 默认初始化的时候，Student数组中10个学生
     */
    private Student[] students = new Student[10];

    // 静态变量来生成学号
    private static int generateNo = 0;


    public StudentService() {
        students[0] = new Student(++generateNo, "张三", "1980-11-10", "男", "12345678910");
        students[1] = new Student(++generateNo, "李四", "1981-11-10", "女", "12345678911");
        students[2] = new Student(++generateNo, "王五", "1982-11-10", "男", "12345678912");
        students[3] = new Student(++generateNo, "赵六", "1983-11-10", "男", "12345678913");
        students[4] = new Student(++generateNo, "jack", "1984-11-10", "女", "12345678914");
        students[5] = new Student(++generateNo, "lucy", "1985-11-10", "男", "12345678915");
        students[6] = new Student(++generateNo, "tom", "1990-11-10", "男", "12345678916");
        students[7] = new Student(++generateNo, "jetty", "2000-11-10", "女", "12345678917");
        students[8] = new Student(++generateNo, "logic", "2001-11-10", "男", "12345678918");
        students[9] = new Student(++generateNo, "AiSen", "2002-11-10", "男", "12345678919");
    }

    /**
     * 显示所有学生信息
     */
    public void displayAll() {
        for (Student student : students) {
            if(student != null) {
                System.out.println(student);
            }
        }
    }


    /**
     * 显示一个学生信息
     *
     * @param no
     */
    public void displayByNo(int no) {
        for (Student student : students) {
            if (student.getNo() == no) {
                System.out.println(student);
                return;
            }
        }
    }

    /**
     * 增加一个学生
     *
     * @param student
     */
    public void add(Student student) {

        // 设置学生的学号
        student.setNo(++generateNo);
        // 假设有空位置
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("添加学生[" + student.getNo() + "]成功");
                return;
            }
        }
        // 没有空位置
        // 扩容
        // 创建新数组，然后将老数组拷贝到新数组中
        Student[] newStudents = new Student[students.length * 2];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        // 这一步很重要
        this.students = newStudents;
        // 注意下标越界
        students[students.length / 2] = student;
        System.out.println("添加学生[" + student.getNo() + "]成功");
    }


    /**
     * 根据学号删除学生
     *
     * @param no
     */
    public void deleteByNo(int no) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getNo() == no) {
                students[i] = null;
                System.out.println("删除学生[" + no + "]成功!");
                return;
            }
        }

    }

    /**
     * 修改学生信息
     *
     * @param student
     */
    public void modify(Student student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null && students[i].equals(student)) {
                students[i] = student;
                System.out.println("修改学生[" + student.getNo() + "]成功!");
                return;
            }
        }
    }
}
