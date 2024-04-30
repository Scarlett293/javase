package com.powernode.javase.oop32;

/**
 * time :2024/3/16 16:08 57
 * ClassName :Character
 * Package :com.powernode.javase.oop32
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 角色接口
 */
public interface Character {
    /**
     * 获取角色名字
     * @return
     */
    String getName();

    /**
     * 获取生命值
     * @return
     */
    int getHealth();

    /**
     * 获取攻击力
     * @return
     */
    int getAttack();


    /**
     * 获取防御力
     * @return
     */
    int getDefense();


    /**
     * 攻击另一个角色
     * @param character 被攻击的对象
     */
    void attack(Character character);

    /**
     * 防御另一个角色的攻击
     * @param character 防御的对象
     */
    void defense(Character character);

}
