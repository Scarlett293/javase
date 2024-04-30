package com.powernode.javase.oop31;

/**
 * time :2024/3/16 15:03 45
 * ClassName :Character
 * Package :com.powernode.javase.oop31
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public interface Character {

    String getName();

    double getHealth();

    double getAttack();

    double getDefense();

    void attack(Character c);

    void defense(Character c);
}
