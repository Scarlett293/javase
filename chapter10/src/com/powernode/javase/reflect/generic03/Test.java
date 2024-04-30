package com.powernode.javase.reflect.generic03;

import com.powernode.javase.reflect.generic04.MyClass;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect.generic03
 * @ClassName: Test
 * @Date: 2024/4/24 19:59 35
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<MyClass> myClassClass = MyClass.class;
        // 获取方法
        Method mMethod = myClassClass.getDeclaredMethod("m", List.class, List.class);
        // 获取方法上的泛型
        Type[] genericParameterTypes = mMethod.getGenericParameterTypes();
        for (Type g : genericParameterTypes) {
            if (g instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) g;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type a : actualTypeArguments) {
                    System.out.println(a.getTypeName());
                }
            }
        }

        // 获取方法返回值上的泛型
    }
}
