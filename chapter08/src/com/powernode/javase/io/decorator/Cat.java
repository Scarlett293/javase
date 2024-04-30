package com.powernode.javase.io.decorator;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator
 * @ClassName: Cat
 * @Date: 2024/4/21 21:28 00
 */
public class Cat implements Flyable{
    @Override
    public void fly() {
        System.out.println("Cat fly!");
    }
}
