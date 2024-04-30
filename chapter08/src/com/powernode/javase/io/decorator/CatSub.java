package com.powernode.javase.io.decorator;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator
 * @ClassName: CatSub
 * @Date: 2024/4/21 21:32 14
 */
public class CatSub extends Cat{
    @Override
    public void fly() {
        long begin = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
