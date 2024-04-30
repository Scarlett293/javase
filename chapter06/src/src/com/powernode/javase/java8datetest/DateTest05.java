package src.com.powernode.javase.java8datetest;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * time :2024/4/15 18:00 52
 * ClassName :DateTest05
 * Package :src.com.powernode.javase.java8datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DateTest05 {
    public static void main(String[] args) {

        // 获取系统当前时间
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime localDateTime1 = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(localDateTime3);
    }
}
