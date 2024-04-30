package com.powernode.javase.io.decorator;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator
 * @ClassName: Test
 * @Date: 2024/4/21 21:28 52
 */
public class Test {
    public static void main(String[] args) {
        //Flyable flyable1 = new Cat();
        Flyable flyable1 = new CatSub();
        flyable1.fly();

        //Flyable flyable2 = new Bird();
        Flyable flyable2 = new BirdSub();
        flyable2.fly();


    }
}
