package src.com.powernode.javase.java8datetest;

/**
 * time :2024/4/15 17:52 58
 * ClassName :DateTest04
 * Package :src.com.powernode.javase.java8datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.time.LocalDate;
import java.time.Period;

/**
 * 计算两个日期的差： java.time.Period
 */
public class DateTest04 {
    public static void main(String[] args) {
        // 获取日期1
        LocalDate date1 = LocalDate.of(2007, 7, 7);
        // 获取日期2
        LocalDate date2 = LocalDate.of(2008, 8, 8);
        // 计算两个日期差
        Period between = Period.between(date1, date2);

        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
    }
}
