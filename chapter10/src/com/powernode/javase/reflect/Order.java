package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: Order
 * @Date: 2024/4/23 20:24 27
 */
public class Order {
    private String no;
    private double price;
    private String state;

    @Override
    public String toString() {
        return "Order{" +
                "no='" + no + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }

    public Order() {
    }

    public Order(String no, double price, String state) {
        this.no = no;
        this.price = price;
        this.state = state;
    }

    public Order(String no) {
        this.no = no;
    }

    public Order(String no, double price) {
        this.no = no;
        this.price = price;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
