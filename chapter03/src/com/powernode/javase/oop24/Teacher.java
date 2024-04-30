package com.powernode.javase.oop24;

/**
 * time :2024/3/13 20:44 39
 * ClassName :Teacher
 * Package :com.powernode.javase.oop24
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Teacher extends Person{

    /**
     * 特有的属性：工资
     */

    double sel;

    public Teacher() {
    }

    public Teacher(double sel) {
        this.sel = sel;
    }
}
