package com.powernode.javase.oop13;

/**
 * time :2024/3/11 19:02 01
 * ClassName :Product
 * Package :com.powernode.javase.oop13
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Product {
    private String name;
    private double price;
    private int num;

    public Product() {
    }

    public Product(String name, int price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getAllPrice() {
        double allPrice = this.price * this.num;
        System.out.println("总价为：" + allPrice);
        return allPrice;
    }
}
