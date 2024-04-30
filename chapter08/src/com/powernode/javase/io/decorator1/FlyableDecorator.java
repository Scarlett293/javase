package com.powernode.javase.io.decorator1;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator1
 * @ClassName: FlyableDecorator
 * @Date: 2024/4/21 22:13 26
 */
public class FlyableDecorator implements Flyable {
    private Flyable flyable;

    public FlyableDecorator(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public void fly() {
        flyable.fly();
    }
}
