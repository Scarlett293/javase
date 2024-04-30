package com.powernode.javase.oop32;

/**
 * time :2024/3/16 16:13 56
 * ClassName :Hero
 * Package :com.powernode.javase.oop32
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 英雄类
 */
public class Hero implements Character {
    /**
     * 名字
     */
    private String name;
    /**
     * 生命值
     */
    private int health;
    /**
     * 攻击力
     */
    private int attack;
    /**
     * 防御力
     */
    private int defense;

    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void attack(Character character) {
        // 英雄进行了攻击
        System.out.println(this.getName() + "向" + character.getName() + "发起了攻击，攻击力" + this.getAttack() + "，" + character.getName() + "进行了防御，防御力" + character.getDefense());

        // 怪物进行了防御
        character.defense(this);

    }

    @Override
    public void defense(Character character) {

    }

}
