package com.powernode.javase.oop32;

/**
 * time :2024/3/16 16:34 46
 * ClassName :Test
 * Package :com.powernode.javase.oop32
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个英雄对象
        Hero hero = new Hero("剑士", 10, 5, 4);
        MonsterImpl monster = new MonsterImpl("骷髅王", 20, 3, 3, 150);

        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);
        hero.attack(monster);


        monster.attack(hero);
    }
}
