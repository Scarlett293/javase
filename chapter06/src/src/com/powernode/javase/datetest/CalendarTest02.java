package src.com.powernode.javase.datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * time :2024/4/15 16:35 39
 * ClassName :CalendarTest02
 * Package :src.com.powernode.javase.datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CalendarTest02 {

    public static void main(String[] args) throws ParseException {
        // 获取系统当前时间的日历
        Calendar cal = Calendar.getInstance();


        // 获取的日历年是2008年
        cal.set(Calendar.YEAR, 2008);

        // 获取当前日历的年月日信息
        System.out.println(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");

        // 设置日历是2008年8月8日 8时8分8秒的日历
        cal.set(2008, Calendar.SEPTEMBER,8,8,8,8);
        System.out.println(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");



        // 年+1
        cal.add(Calendar.YEAR, -2);
        System.out.println(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");


        // 获取一个2008年5月12日 15:30:30的Date
        String strDate = "2008-05-12 15:30:30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(strDate);
        cal.setTime(date);


        // 获取这个日历的小时和分
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));


        // 获取日历代表的日期
        cal.set(Calendar.SECOND, 56); // 修改日历中的秒
        Date time = cal.getTime();
        String s = sdf.format(time);
        System.out.println(s);
    }
}
