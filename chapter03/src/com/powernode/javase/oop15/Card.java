package com.powernode.javase.oop15;

/**
 * time :2024/3/11 19:16 51
 * ClassName :Card
 * Package :com.powernode.javase.oop15
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Card {
    private String name;
    private String cardNumber;
    private double balance;

    public Card() {
    }

    public Card(String name, String cardNumber, double balance) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(int n) {
        this.balance = this.balance + n;
        this.checkYourBalance();
    }

    public void withdrawal(int n) {
        if(this.balance < n) {
            System.out.println("余额不足");
            return;
        }
        this.balance = this.balance - n;
        this.checkYourBalance();

    }

    public void checkYourBalance() {
        System.out.println("您的余额为：" + this.balance);
    }
}
