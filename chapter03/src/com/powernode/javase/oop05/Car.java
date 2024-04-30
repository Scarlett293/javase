package com.powernode.javase.oop05;

/**
 * time :2024/3/9 19:07 21
 * ClassName :Car
 * Package :com.powernode.javase.oop05
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Car {
    private String brand;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 500000 || price <= 200000) {
            System.out.println("价格有误，请重新输入。");
            return;
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
