package com.powernode.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest04
 * @Date: 2024/4/23 17:07 01
 */
public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        Class vipClass = Class.forName("com.powernode.javase.reflect.Vip");
/*
        Field[] fields = vipClass.getFields();
        System.out.println(fields.length);


        for (Field field : fields) {
            System.out.println(field.getName());
        }*/

        Field[] fields = vipClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getType().getSimpleName());
            //
            System.out.println(field.getModifiers());
            System.out.println(Modifier.toString(field.getModifiers()));
        }
    }
}
