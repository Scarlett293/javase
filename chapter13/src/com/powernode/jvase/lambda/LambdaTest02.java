package com.powernode.jvase.lambda;

/**
 * ClassName: LambdaTest02
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 18:09
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest02 {
    public static void main(String[] args) {

        // 匿名内部类方式（匿名内部类可以是一个抽象类）
        LambdaTest02.test(new Animal(){
            @Override
            public void run() {
                System.out.println("Animal run...");
            }
        });

        // 尝试将上面的代码修改为Lambda表达式方式
        // 编译报错：只有接口才可以使用Lambda表达式
        // LambdaTest02.test(() -> {System.out.println("Animal run..."); });


        LambdaTest02.doFly(new Flyable() {
            @Override
            public void run() {
                System.out.println("run......");
            }

            @Override
            public void fly() {
                System.out.println("fly.......");
            }
        });

        // 尝试使用Lambda表达式
        // Lambda表达式使用的接口必须
        // LambdaTest02.doFly(() -> {});
    }
    public static void test(Animal a) {
        a.run();
    }

    public static void doFly(Flyable f) {
        f.fly();
        f.run();
    }
}

abstract class Animal {
    public abstract void run();
}

interface Flyable {
    void run();
    void fly();
}
