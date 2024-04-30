package com.powernode.javase.oop14;

/**
 * time :2024/3/11 19:05 08
 * ClassName :Person
 * Package :com.powernode.javase.oop14
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Person {
    private String name;
    private int age;
    private boolean gender;
    static int population = 0;


    public Person() {
        Person.addPopulation();
    }

    public Person(String name, int age, boolean gender) {
        Person.addPopulation();
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Person.population = population;
    }

    public static void addPopulation() {
        Person.population = Person.population + 1;
    }

}
