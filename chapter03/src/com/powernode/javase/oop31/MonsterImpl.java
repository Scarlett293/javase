package com.powernode.javase.oop31;

/**
 * time :2024/3/16 15:19 29
 * ClassName :MosterImp1
 * Package :com.powernode.javase.oop31
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class MonsterImpl implements Monster {
    private String name;
    private double health;
    private double attack;
    private double defense;
    private boolean rage = true;

    public MonsterImpl(String name, double health, double attack, double defense) {
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
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    /**
     * 攻击方法
     *
     * @param c
     */
    public void attack(Character c) {
        c.defense(this);
    }


    /**
     * 防御方法
     *
     * @param c
     */
    public void defense(Character c) {
        if (this.defense >= c.getAttack()) {
            System.out.println(c.getName() + "未能击穿防御, " + this.getName() + "觉得" + c.getName() + "的按摩功夫有待提高。" + this.getName() + "剩余生命值: " + this.getHealth());
        } else {
            double damage = c.getAttack() - this.getDefense();
            this.setHealth(this.getHealth() - damage);
            System.out.println(c.getName() + "造成了" + damage + "点伤害, " + this.name + "直呼: 斗宗强者，恐怖如斯。"  + this.getName() + "剩余生命值: " + this.getHealth());
            if(this.getHealth() <= 5 && this.rage) {
                System.out.println(this.getName() + "感受到了死亡的威胁，它的攻击力得到了大幅提升！");
                this.rage = false;
                this.setAttack(this.getAttack() * 2);
            }
            if(this.getHealth() <= 0) {
                this.getReward();
            }
        }
    }

    /**
     * 战利品方法
     */

    public void getReward() {
        System.out.println(this.name + "感觉自己的生机缓缓流逝...");
        System.out.println(this.name + ": 这力量，正是为王的理由。");
        System.out.println(this.name + "话毕，在原地留下100金币，身影骤然消散，宛若从未出现这片天地。");
    }

}
