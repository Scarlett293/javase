package com.powernode.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest13
 * @Date: 2024/4/23 21:29 00
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception {
        //
        ResourceBundle bundle = ResourceBundle.getBundle("com.powernode.javase.reflect.config");
        String className = bundle.getString("className");
        String methodName = bundle.getString("methodName");
        String parameterTypes = bundle.getString("parameterTypes");
        String parameterValues = bundle.getString("parameterValues");

        // 通过反射机制调用方法
        // 创建对象（依赖无参数构造方法）
        Class<?> clazz = Class.forName(className);
        Constructor<?> defaultCon = clazz.getDeclaredConstructor();
        Object obj = defaultCon.newInstance();

        // 获取方法
        // java.lang.String,java.lang.String
        String[] strParameterTypes = parameterTypes.split(",");
        Class[] classParameterTypes = new Class[strParameterTypes.length];
        for (int i = 0; i < strParameterTypes.length; i++) {
            classParameterTypes[i] = Class.forName(strParameterTypes[i]);
        }
        Method method = clazz.getDeclaredMethod(methodName, classParameterTypes);

        // 调用方法
        // parameterValues=admin,123456
        Object retValue = method.invoke(obj, parameterValues.split(","));
        System.out.println(retValue);
    }
}
