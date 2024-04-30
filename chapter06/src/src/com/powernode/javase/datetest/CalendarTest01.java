package src.com.powernode.javase.datetest;

/**
 * time :2024/4/15 16:21 07
 * ClassName :CalendarTest01
 * Package :src.com.powernode.javase.datetest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.util.Calendar;

/**
 * java.util.Calendar 日历类
 */
public class CalendarTest01 {

    public static final int I1 = 1;
    public static final int I2 = 2;
    public static final int I3 = 3;

    /**
     * 当num==1的时候
     * 当num==2的时候
     * 当num==3的时候
     * @param num
     */
    public static void m(int num) {

    }
    public static void main(String[] args) {
        m(CalendarTest01.I1);




        // 获取当前实践的日历对象（调用一个静态方法）
        Calendar calendar = Calendar.getInstance();

//        System.out.println(calendar);

        // 获取日历中的年
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);


        // 获取月
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        // 获取日历中的日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

}
