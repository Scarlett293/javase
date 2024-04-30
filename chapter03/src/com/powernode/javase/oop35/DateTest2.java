package com.powernode.javase.oop35;
import com.powernode.javase.oop33.Date;
/**
 * time :2024/3/27 19:32 04
 * ClassName :DateTest2
 * Package :com.powernode.javase.oop35
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 1. Object类设计equals方法的作用是什么？目的是什么？
 *      equals方法的作用是：判断两个对象是否相等
 *      equals方法的返回值是true/false
 *      ture表示两个对象相等
 *      false表示两个对象不相等
 *
 * 2. Object类中对equals方法的默认实现是怎么样的？
 *      public boolean equals(Object obj) {
 *          return (this == obj)
 *      }
 *      a.equals(b) 表示a和的比较，实际上的方法体当中是：this和obj的比较
 *
 * 3. 关于 == 运算符的运算规则
 *      == 永远只有一个运算规则，永远比较的是变量中保存的值之间的比较
 *      只不过有的时候这个值是基本数据类型，有的时候是对象的内存地址
 *
 * 4. equals方法为什么要重写？
 *      因为Object类中的equals方法在进行比较的时候，比较的是两个java对象的内存地址
 *      我们希望比较的是对象的内容，只要对象的内容相等，则认为是相同的
 */
public class DateTest2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a == b); // == 运算规则：比较两个变量中保存的值
        int c = 20;
        System.out.println(a == c); // false

        Object obj1 = new Object(); // Object obj1 = 0x12;
        Object obj2 = new Object(); // Object obj2 = 0x23;
        System.out.println(obj1 == obj2);  // false

        Date d1 = new Date(2008, 8, 8);
        Date d2 = new Date(2008, 8, 8);

        System.out.println(d1 == d2); // false

        // Date在重写equals方法之前：false
        System.out.println(d1.equals(d2)); // false


    }
}
