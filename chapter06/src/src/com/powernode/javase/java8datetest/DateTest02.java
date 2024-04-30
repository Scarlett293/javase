package src.com.powernode.javase.java8datetest;

/**
 * time :2024/4/15 17:41 59
 * ClassName :DateTest02
 * Package :src.com.powernode.javase.java8datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.time.Instant;

/**
 * 获取时间戳：自1970-1-1到当前系统时间的总毫秒数
 */
public class DateTest02 {
    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        System.out.println("时间戳：" + l);

        // Java8的API也可以获取时间戳。
        Instant now = Instant.now(); // 系统当前时间，基于UTC（全球标准时间）
//        System.out.println(now);

        long epochMilli = now.toEpochMilli();
        System.out.println(epochMilli);
    }
}
