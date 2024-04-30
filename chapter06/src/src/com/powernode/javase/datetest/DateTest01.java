package src.com.powernode.javase.datetest;

// 注意：我们学习的是java.util.Date
// 不是java.sql.Date（java.sql.Date的父类是java.util.Date）
import java.util.Date;
/**
 * time :2024/4/15 12:16 40
 * ClassName :DateTest01
 * Package :src.com.powernode.javase.datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * java.util.Date 日期API
 *
 */
public class DateTest01 {
    public static void main(String[] args) {
        // Date类的构造方法
        // Date()
        // Date(long l)

        // 获取系统当前时间
        Date date = new Date();
        System.out.println(date);


        // 获取指定的时间（参数的单位是毫秒数）
        Date date1 = new Date(1000);
        System.out.println(date1);

        // 获取当前系统时间的前10分钟时间
        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date2);

        Date date3 = new Date(System.currentTimeMillis() - 1000 * 60 * 10);
        System.out.println(date3);


    }
}
