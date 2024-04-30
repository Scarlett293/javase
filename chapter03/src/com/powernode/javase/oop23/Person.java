package com.powernode.javase.oop23;

/**
 * time :2024/3/13 19:21 51
 * ClassName :Person
 * Package :com.powernode.javase.oop23
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 父类：包含了EnglishPerson和ChinesePerson的公共属性和类
 */
public abstract class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * 问候对方的方法
     */
    public abstract void great();
}
