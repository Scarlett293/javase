package com.powernode.javase.oop24;

/**
 * time :2024/3/13 20:44 47
 * ClassName :Person
 * Package :com.powernode.javase.oop24
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Person {
    String name;
    int age;
    String email;
    String adress;

    public Person() {
    }

    public Person(String name, int age, String email, String adress) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
