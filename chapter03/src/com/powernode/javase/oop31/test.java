package com.powernode.javase.oop31;

/**
 * time :2024/3/16 15:24 19
 * ClassName :test
 * Package :com.powernode.javase.oop31
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class test {
    public static void main(String[] args) {
        Hero h = new Hero("史蒂夫", 30, 4, 2);
        MonsterImpl m = new MonsterImpl("骷髅王特里", 20, 4, 1);

        h.attack(m);
        m.attack(h);
        h.attack(m);
        m.attack(h);
        h.attack(m);
        m.attack(h);
        h.attack(m);
        m.attack(h);
        h.attack(m);
        m.attack(h);
        h.attack(m);
        m.attack(h);
        h.attack(m);
    }
}
