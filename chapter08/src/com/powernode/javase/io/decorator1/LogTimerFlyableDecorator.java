package com.powernode.javase.io.decorator1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.decorator1
 * @ClassName: LogTimerFlyableDecorator
 * @Date: 2024/4/21 22:09 23
 */
public class LogTimerFlyableDecorator extends FlyableDecorator{
    // private Flyable flyable;

    public LogTimerFlyableDecorator(Flyable flyable) {
        super(flyable);
    }

    @Override
    public void fly() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(now) + ": 起飞前的准备");
        super.fly();

        now = new Date();
        System.out.println(sdf.format(now) + ": 安全降落");
    }
}
