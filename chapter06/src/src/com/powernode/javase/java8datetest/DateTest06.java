package src.com.powernode.javase.java8datetest;

/**
 * time :2024/4/15 18:05 56
 * ClassName :DateTest06
 * Package :src.com.powernode.javase.java8datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期格式化
 */
public class DateTest06 {
    public static void main(String[] args) {

        // LocalDateTime --> String
        // 获取一个日期时间
        LocalDateTime now = LocalDateTime.now();
        // 创建格式化对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化
        String s = dateTimeFormatter.format(now);
        System.out.println(s);

        // String --> LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse("2008-08-08 08:08:08", dateTimeFormatter);
        System.out.println(localDateTime);
    }
}
