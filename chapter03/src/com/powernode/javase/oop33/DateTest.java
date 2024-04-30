package com.powernode.javase.oop33;

/**
 * time :2024/3/25 22:32 36
 * ClassName :DateTest
 * Package :com.powernode.javase.oop33
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * Object类中的toString()方法：
 *
 * 1，Object类设计toString()方法的目的是什么？
 *      这个方法的作用是：将java对象转换成字符串的表示形式
 *
 * 2，Object类中的toString()方法的默认实现是怎样的？
 *     public String toString() {
 *         return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
 *     }
 *     默认实现方法是：完整类名 + @ + 十六进制的数字
 *     这个输出结果可以等同看作一个java对象的内存地址。
 *
 */
public class DateTest {
    public static void main(String[] args) {
        DateTest dateTest = new DateTest();
        String s = dateTest.toString();
        System.out.println(s); // com.powernode.javase.oop33.DateTest@b4c966a


        Date d = new Date();
        Date d2 = new Date(2008, 8, 8);
        String s1 = d.toString();
        String s2 = d.toString();
        System.out.println(s1); // com.powernod  e.javase.oop33.Date@4e50df2e
        System.out.println(s2);


        Date d3 = new Date(2008, 5, 12);
        // 当println()输出调用的是一个引用类型的时候，会自动调用"引用.toString()"
        System.out.println(d3); // 2008年5月12日

        Date d4 = null;
        System.out.println(d4); // "null"
        // System.out.println(d4.toString()); // 空指针异常

        System.out.println(d4 == null ? "null" : d4.toString());

    }
}
