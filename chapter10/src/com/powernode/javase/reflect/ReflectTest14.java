package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest14
 * @Date: 2024/4/24 10:06 03
 */
public class ReflectTest14 {
    public static void main(String[] args) throws Exception {
        //
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();


        // System.out.println(systemClassLoader);

        Class<?> aClass = systemClassLoader.loadClass("com.powernode.javase.reflect.User");

    }
}
