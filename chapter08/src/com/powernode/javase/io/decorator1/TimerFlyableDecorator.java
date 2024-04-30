package com.powernode.javase.io.decorator1;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator1
 * @ClassName: FlyableDecorator
 * @Date: 2024/4/21 21:51 47
 */
public class TimerFlyableDecorator extends FlyableDecorator {

    // 有一个被装饰者的引用。
    // 这个引用的类型最好是抽象的，不是具体的。
    // 因为Cat和Bird都实现了接口Flyable
    // 因此这里的被装饰者引用，它的类型是 Flyable
    // private Flyable flyable = null;

    public TimerFlyableDecorator(Flyable flyable) {
        super(flyable);
    }

    @Override
    public void fly() {
        // （前增强）
        long begin = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin) + "毫秒");
        // （后增强）
    }
}
