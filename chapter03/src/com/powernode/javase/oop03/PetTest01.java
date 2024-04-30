package com.powernode.javase.oop03;

/**
 * time :2024/3/9 18:41 23
 * ClassName :PetTest01
 * Package :com.powernode.javase.oop03
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class PetTest01 {
    public static void main(String[] args) {
        Pet p1 = new Pet();

        System.out.println(p1.name);
        System.out.println(p1.dateOfBirth);
        System.out.println(p1.gender);

        p1.eat();
        p1.run();
    }
}
