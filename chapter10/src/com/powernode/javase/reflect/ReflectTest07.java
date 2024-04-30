package com.powernode.javase.reflect;

import java.lang.reflect.Field;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest07
 * @Date: 2024/4/23 19:04 29
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        //
        Customer customer = new Customer();


        customer.name = "张三";

        System.out.println(customer.name);

        //

        Class clazz = Class.forName("com.powernode.javase.reflect.Customer");

        Field ageField = clazz.getDeclaredField("age");

        ageField.setAccessible(true);

        ageField.set(customer, 30);

        System.out.println("年龄" + ageField.get(customer));




        //
        Field nameField = clazz.getDeclaredField("name");

        nameField.set(customer, "李四");

        System.out.println(nameField.get(customer));
    }
}
