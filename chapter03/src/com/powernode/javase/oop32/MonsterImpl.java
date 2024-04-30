package com.powernode.javase.oop32;

/**
 * time :2024/3/16 16:16 09
 * ClassName :MonsterImpl
 * Package :com.powernode.javase.oop32
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 怪物类
 */
public class MonsterImpl implements Monster {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int reward;

    public MonsterImpl() {

    }

    public MonsterImpl(String name, int health, int attack, int defense, int reward) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.reward = reward;
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
    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    /**
     * 英雄向怪物发起了攻击，攻击力3，怪物进行了防御，防御力1，怪物受到2点伤害，当前怪物生命值x。
     * 英雄向怪物发起了攻击，攻击力3，怪物进行了防御，防御力1，怪物受到2点伤害，怪物挂了，英雄得到100金币的奖励。
     * 英雄向怪物发起了攻击，攻击力3，怪物进行了防御，防御力3，怪物没有受到任何伤害。
     * 英雄向怪物发起了攻击，攻击力3，怪物进行了防御，防御力1，怪物受到2点伤害，当前怪物生命值x，怪物愤怒了，怪物攻击力翻倍。
     *
     * @param character 被攻击的对象
     */
    @Override
    public void attack(Character character) {



    }

    @Override
    public void defense(Character character) {
        // 如果怪物的生命值小于0，程序结束
        if (this.getHealth() <= 0) {
            return;
        }

        // 怪物还有生命
        // 获取伤害值
        int damage = character.getAttack() - this.getDefense();
        // 设置怪物的生命值
        System.out.println(this.getName() + "受到了" + damage + "点伤害");
        this.setHealth(this.getHealth() - damage);

        if(this.getHealth() <= 0) {
            System.out.println(this.getName() + "挂了，" + character.getName() + "获得了" + this.getReward() + "金币的奖励。");
        } else if(damage <= 0) {
            System.out.println(this.getName() + "没有受到任何伤害。");
        } else {
            System.out.print(this.getName() + "当前生命值:" + this.getHealth());
            if(this.getHealth() < 3 ) {
                System.out.print(this.getName() + "愤怒了，" + this.getName() + "伤害翻倍");
                this.attack *= 2;
            }
            System.out.println();
        }

    }
}
