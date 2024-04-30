package com.powernode.javase.oop06;

/**
 * time :2024/3/9 19:13 11
 * ClassName :User
 * Package :com.powernode.javase.oop06
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class User {
    private String username;
    private double balance;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance <= 0) {
            System.out.println("余额输入有误，请重新输入！");
            return;
        }
        this.balance = balance;
    }

    public void withdrawal(int theAmountOfTheWithdrawal) {
        if(theAmountOfTheWithdrawal >= this.balance) {
            System.out.println("取款金额有误，您的余额不足！");
            System.out.println("您要取款的金额:" + theAmountOfTheWithdrawal);
            System.out.println("您的剩余金额:" + this.balance);
            return;
        }
        System.out.println("取款成功，您取出了:" + theAmountOfTheWithdrawal);
        this.balance = this.balance - theAmountOfTheWithdrawal;
        System.out.println("您的剩余金额为:" + this.balance);
    }
}
