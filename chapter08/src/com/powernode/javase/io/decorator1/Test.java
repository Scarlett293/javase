package com.powernode.javase.io.decorator1;


/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator1
 * @ClassName: Test
 * @Date: 2024/4/21 21:46 32
 */
public class Test {
    public static void main(String[] args) {
        // Flyable flyable1 = new TimerFlyableDecorator(new Cat());
        Flyable flyable1 = new LogTimerFlyableDecorator(new Cat());
        flyable1.fly();


        // lyable flyable2 = new TimerFlyableDecorator(new Bird());
        Flyable flyable2 = new LogTimerFlyableDecorator(new Bird());
        flyable2.fly();
    }
}
