package com.powernode.javase.thread13;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread13
 * @ClassName: ThreadTest
 * @Date: 2024/4/23 08:34 18
 */

/**
 * 使用线程同步机制
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
    // private static Object obj = new Object();

    private String actNo;
    private double balance;

    public Account() {
    }

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
    public void withdraw(double money) {
        // this 是当前账户对象
        // 当前账户act，就是t1和t2共享的对象
        //synchronized (obj) {
        synchronized (this) {
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
}
