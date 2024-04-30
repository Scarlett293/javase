package com.powernode.javase.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: Test
 * @Date: 2024/4/24 19:40 03
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<Cat> catClass = Cat.class;

        // 获取当前类的父类泛型
        Type genericSuperclass = catClass.getGenericSuperclass();
        // System.out.println(genericSuperclass instanceof Class);
        // System.out.println(genericSuperclass instanceof ParameterizedType);
        if(genericSuperclass instanceof ParameterizedType) {
            // 转型为参数化类型
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

            for (Type a : actualTypeArguments) {
                System.out.println(a.getTypeName());
            }
        }
    }
}
