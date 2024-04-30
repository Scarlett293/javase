package com.powernode.javase.oop29;

/**
 * time :2024/3/16 14:15 16
 * ClassName :ShanXiCooker
 * Package :com.powernode.javase.oop29
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 陕西厨师
 */
public class ShanXiCooker implements FoodMenu{
    String name;

    public ShanXiCooker() {
    }

    public ShanXiCooker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void xiHongShiChaoDan() {
        System.out.println(this.getName() + "炒的西红柿炒蛋");
    }


    @Override
    public void yuXiangRouSi() {
        System.out.println(this.getName() + "做的鱼香肉丝");
    }

    @Override
    public void youPoMian() {
        System.out.println(this.getName() + "做的油泼面");
    }
}
