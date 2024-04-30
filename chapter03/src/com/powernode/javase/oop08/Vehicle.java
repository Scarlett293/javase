package com.powernode.javase.oop08;

/**
 * time :2024/3/9 20:41 50
 * ClassName :Vehicle
 * Package :com.powernode.javase.oop08
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Vehicle {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 速度
     */
    private int speed;
    /**
     * 长度
     */
    private int length;
    /**
     * 宽度
     */
    private int width;
    /**
     * 高度
     */
    private int height;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed, int length, int width, int height) {
        this.brand = brand;
        this.speed = speed;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * 移动
     * */
    public void move() {
        System.out.println(this.getBrand() + "正在以" + this.getSpeed() + "迈的速度行驶");
    }

    /**
     * 加速
     * */
    public void speedUp() {
        // 每次加10迈
        System.out.println("加速10迈，");
        this.setSpeed(this.getSpeed() + 10);
        this.move();
    }

    /**
     * 减速
     */
    public void speedDown() {
        //每次减10迈
        System.out.println("减速10迈");
        this.setSpeed(this.getSpeed() - 10);
        this.move();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
