package com.powernode.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest08
 * @Date: 2024/4/23 19:28 54
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception {
        //
        Class clazz = Class.forName("com.powernode.javase.reflect.UserService");
        //
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println(methods.length);

        // 遍历
        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getName());
            method.getName();
/*            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getName());
            }*/
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType().getName());
                System.out.println(parameter.getName());
            }


        }
    }
}
