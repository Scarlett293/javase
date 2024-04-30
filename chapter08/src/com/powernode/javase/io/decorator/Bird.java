package com.powernode.javase.io.decorator;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator
 * @ClassName: Bird
 * @Date: 2024/4/21 21:28 29
 */
public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird Fly !");
    }
}
