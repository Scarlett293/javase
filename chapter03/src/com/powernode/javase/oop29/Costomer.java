package com.powernode.javase.oop29;

/**
 * time :2024/3/16 14:18 37
 * ClassName :Costomer
 * Package :com.powernode.javase.oop29
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 顾客面向菜单点菜
 */
public class Costomer {

    public void order(FoodMenu foodMenu) {
        // 调用的方法都是接口中的方法，面向接口编程，面向对象编程。降低程序耦合度，提高扩展力
        foodMenu.xiHongShiChaoDan();
        foodMenu.yuXiangRouSi();
        foodMenu.youPoMian();
    }
}
