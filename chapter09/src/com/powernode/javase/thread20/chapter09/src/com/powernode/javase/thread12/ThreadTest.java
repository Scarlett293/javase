package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread12;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread12
 * @ClassName: ThreadTest
 * @Date: 2024/4/23 08:20 27
 */
public class ThreadTest {
    public static void main(String[] args) {
        Account act = new Account("act-001", 10000);

        Thread t1 = new Thread(new WithDraw(act));
        Thread t2 = new Thread(new WithDraw(act));
        t1.start();
        t2.start();
    }
}

class WithDraw implements Runnable {
    // 实例变量
    private Account act;
    public WithDraw(Account act) {
        this.act = act;
    }
    @Override
    public void run() {
        act.withdraw(1000);
    }
}

class Account {
    private String actNo;
    private double balance;

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 取款
     *
     * @param money 额度
     */
    public synchronized void withdraw(double money) {
        double before = this.getBalance();
        System.out.println(Thread.currentThread().getName() + "线程正在取款，当前" + this.getActNo() + "账户余额" + before);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setBalance(before - money);
        System.out.println(Thread.currentThread().getName() + "线程取款成功，当前" + this.getActNo() + "账户余额" + this.getBalance());
    }
}
