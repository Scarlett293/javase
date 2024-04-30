package src.com.powernode.javase.bignumtest;

/**
 * time :2024/4/15 12:04 23
 * ClassName :DecimalFormatTest01
 * Package :src.com.powernode.javase.bignumtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.text.DecimalFormat;

/**
 * 数字的格式化展示的时候，需要使用这个类
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {

        // 创建一个数字格式化对象
        DecimalFormat df1 = new DecimalFormat("###,###.##");
        String s1 = df1.format(12345678.123);
        System.out.println(s1); // 12,345,678.12


        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(12345678.123);
        System.out.println(s2); // 12,345,678.12

    }
}
