package src.com.powernode.javase.java8datetest;

/**
 * time :2024/4/15 17:47 35
 * ClassName :DateTest03
 * Package :src.com.powernode.javase.java8datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 计算两个时间的差：java.time.Duration
 */
public class DateTest03 {
    public static void main(String[] args) {
        // 获取时间1
        LocalDateTime time1 = LocalDateTime.of(2008, 7, 8, 8, 8, 8);

        // 获取时间2
        LocalDateTime time2 = LocalDateTime.of(2008, 8, 8, 8, 8, 8);

        // 获取两个时间的差
        Duration between = Duration.between(time1, time2);

        // 看看差多少天
        System.out.println(between.toDays());

        // 看看差多少小时
        System.out.println(between.toHours());
    }
}
