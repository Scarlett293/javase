package com.powernode.javase.reflect.generic02;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect.generic02
 * @ClassName: Test
 * @Date: 2024/4/24 19:51 51
 */
public class Test {
    public static void main(String[] args) {
        Class<Mouse> mouseClass = Mouse.class;
        // 获取接口上的泛型
        Type[] genericInterfaces = mouseClass.getGenericInterfaces();
        for (Type g : genericInterfaces) {
            if(g instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) g;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for(Type a : actualTypeArguments) {
                    System.out.println(a.getTypeName());
                }
            }
        }
    }
}
