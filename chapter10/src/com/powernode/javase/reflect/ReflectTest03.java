package com.powernode.javase.reflect;

import java.util.ResourceBundle;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest03
 * @Date: 2024/4/23 17:00 45
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("com.powernode.javase.reflect.classInfo");

        String className = bundle.getString("className");

        Class classObj = Class.forName(className);

        Object obj = classObj.newInstance();

        System.out.println(obj);

    }
}
