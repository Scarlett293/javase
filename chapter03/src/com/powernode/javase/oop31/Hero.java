package com.powernode.javase.oop31;

/**
 * time :2024/3/16 15:04 33
 * ClassName :Hero
 * Package :com.powernode.javase.oop31
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Hero implements Character{

    private String name;
    private double health;
    private double attack;
    private double defense;

    public Hero(String name, double health, double attack, double defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    /**
     * 攻击方法
     * @param c
     */
    public void attack(Character c) {
        c.defense(this);
    }


    /**
     * 防御方法
     * @param c
     */
    public void defense(Character c) {
        if(this.defense >= c.getAttack()) {
            System.out.println(c.getName() + "未能击穿防御, " + this.getName() + "觉得" + c.getName() + "的按摩功夫有待提高。" + this.getName() + "剩余生命值: " + this.getHealth());
        } else {
            double damage = c.getAttack() - this.getDefense();
            this.setHealth(this.getHealth() - damage);
            System.out.println(c.getName() + "造成了" + damage + "点伤害, " + this.name + "直呼: 斗宗强者，恐怖如斯。" + this.getName() + "剩余生命值: " + this.getHealth());
        }
        if(this.getHealth() <= 0) {
            System.out.println(this.getName() + "的吉尔被捏爆了");
        }
    }

}
