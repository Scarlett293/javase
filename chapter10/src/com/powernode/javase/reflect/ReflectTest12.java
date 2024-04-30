package com.powernode.javase.reflect;

import java.lang.reflect.Constructor;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest12
 * @Date: 2024/4/23 21:23 36
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception {
        Order order1 = new Order();
        System.out.println(order1);
        Order order2 = new Order("111122222", 3650.5, "已完成");
        System.out.println(order2);
        Class clazz = Class.forName("com.powernode.javase.reflect.Order");

        // 这种方式依赖的是必须有一个无参数构造方法，如果没有会出现异常！
        // 在Java9的时候，这个方法被标注了已过时，不建议使用了。
		/* Object obj = clazz.newInterface();
		System.out.println(obj); */

        // 获取Order的无参数构造方法
        Constructor defaultCon = clazz.getDeclaredConstructor();
        // 调用无参数构造方法实例化对象
        Object obj = defaultCon.newInstance();
        System.out.println(obj);

        // 获取三个参数的构造方法
        Constructor threeArgsCon = clazz.getDeclaredConstructor(String.class, double.class, String.class);
        // 调用三个参数的构造方法
        Object obj1 = threeArgsCon.newInstance("5552454222", 6985.0, "未完成");
        System.out.println(obj1);
    }
}
