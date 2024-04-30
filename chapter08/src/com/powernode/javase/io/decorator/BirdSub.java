package com.powernode.javase.io.decorator;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator
 * @ClassName: BirdSub
 * @Date: 2024/4/21 21:33 12
 */
public class BirdSub extends Bird{
    @Override
    public void fly() {
        long begin = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();

        System.out.println(end - begin);
    }
}
