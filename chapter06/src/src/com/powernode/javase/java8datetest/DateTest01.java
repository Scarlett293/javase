package src.com.powernode.javase.java8datetest;

import java.time.LocalDateTime;

/**
 * time :2024/4/15 17:00 50
 * ClassName :DateTest01
 * Package :src.com.powernode.javase.java8datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DateTest01 {

    public DateTest01 m1() {
        System.out.println("m1...");
        return this;
    }

    public DateTest01 m2() {
        System.out.println("m2...");
        return this;
    }

    public DateTest01 m3() {
        System.out.println("m3...");
        return this;
    }

    public static void main(String[] args) {

        DateTest01 dateTest01 = new DateTest01();
        dateTest01.m1().m2().m3();


        // 获取系统当前时间，精确到纳秒级
        LocalDateTime now = LocalDateTime.now();
        System.out.println("系统当前时间:" + now);

        // 获取指定的日期时间
        LocalDateTime localDateTime = LocalDateTime.of(2008, 8, 8, 8, 8, 8, 8);
        System.out.println(localDateTime);

        // 加日期时间
/*        LocalDateTime localDateTime1 = localDateTime.plusYears(1);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = localDateTime.plusSeconds(1);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = localDateTime1.plusSeconds(1);
        System.out.println(localDateTime3);*/


        // 对象的链式调用

        LocalDateTime localDateTime1 = localDateTime.plusYears(1).plusSeconds(1);
        System.out.println(localDateTime1);

        // 减日期时间
        LocalDateTime localDateTime2 = localDateTime1.minusYears(1).minusMonths(1);
        System.out.println(localDateTime2);
    }
}
