package src.com.powernode.javase.datetest;

/**
 * time :2024/4/15 12:21 55
 * ClassName :DateTest02
 * Package :src.com.powernode.javase.datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化，休要借助：
 *      java.text.DateFormat
 *      java.text.SimpleDateFormat（用这个，DateFormat是SimpleDateFormat的父类。）
 */
public class DateTest02 {
    public static void main(String[] args) throws ParseException {

        // java.util.Date ---> java.lang.String

        // 获取系统当前时间
        Date now = new Date();


        // 格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

        // 调用format方法完成格式化
        String s = sdf.format(now);
        System.out.println(s);


        // java.lang.String ---> java.util.Date
        // 日期字符串
        String strDate = "2008-08-08 08:08:08 888";

        // 创建日期格式化对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

        Date date = sdf2.parse(strDate);

        System.out.println(date);


    }
}
