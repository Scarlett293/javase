package com.powernode.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest11
 * @Date: 2024/4/23 20:25 29
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        // 获取类
        Class clazz = Class.forName("com.powernode.javase.reflect.Order");
        // 类的修饰符
        sb.append(Modifier.toString(clazz.getModifiers()));
        sb.append(" class ");
        // 类名
        sb.append(clazz.getName());
        sb.append(" extends ");
        // 父类名
        sb.append(clazz.getSuperclass().getName());
        // 实现的接口
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            sb.append(" implements ");
            for (int i = 0; i < interfaces.length; i++) {
                sb.append(interfaces[i].getName());
                if (i != interfaces.length - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("{\n");
        // 类体
        // 获取所有的构造方法
        Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor con : cons) {
            sb.append("\t");
            // 构造方法修饰符
            sb.append(Modifier.toString(con.getModifiers()));
            sb.append(" ");
            // 构造方法名
            sb.append(con.getName());
            // 构造方法参数列表
            sb.append("(");
            Parameter[] parameters = con.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                Parameter parameter = parameters[i];
                sb.append(parameter.getType().getName());
                sb.append(" ");
                sb.append(parameter.getName());
                if (i != parameters.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
