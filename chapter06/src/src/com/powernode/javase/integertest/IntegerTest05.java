package src.com.powernode.javase.integertest;

/**
 * time :2024/4/15 11:26 26
 * ClassName :IntegerTest05
 * Package :src.com.powernode.javase.integertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 关于自动拆箱和自动装箱
 *          1. Java5的新特性
 *          2. 自动装箱和自动拆箱属于编译阶段的功能
 *          3. 自动装箱： auto boxing
 *          4. 自动拆箱： auto unboxing
 *          5. 自动装箱和自动拆箱机制是为了方便写代码而存在的机制
 *          6. 装箱：Integer i = new Integer(100);
 *          7, 拆箱：int num = i.intValue();
 */
public class IntegerTest05 {

    public static void m1(Integer i) {
        // 发生自动拆箱
        // 注意空指针异常

        if (i != null) {
            System.out.println(i + 1);
        }

    }
    public static void main(String[] args) {

        m1(10000);
        // 自动装箱
        Integer x = 10000; // 程序在编译的时候底层实际上的代码是：Integer x = new Integer(1000);


        // Integer a = 10000;
        // Integer b = 10000;
        // System.out.println(a == b); // false （堆当中两个Integer对象，内存地址不同）
        // 自动拆箱
        int n = x; // 底层实际上会调用：int num = x.intValue();


        x = null;
        int num2 = x; // int num2 = x.intValue
    }
}
