package com.powernode.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest06
 * @Date: 2024/4/23 17:30 26
 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        // 获取Stirng了
        Class stringClass = Class.forName("java.lang.String");
        StringBuilder sb = new StringBuilder();
        sb.append(Modifier.toString(stringClass.getModifiers()));
        sb.append(" class ");
        //sb.append(stringClass.getSimpleName());
        sb.append(stringClass.getName());
        sb.append(" extends ");
        // 获取当前类的父类
        sb.append(stringClass.getSuperclass().getName());
        Class[] interfaces = stringClass.getInterfaces();
        if (interfaces.length > 0) {
            sb.append(" implements ");
            for (int i = 0; i < interfaces.length; i++) {
                Class interfaceClass = interfaces[i];
                sb.append(interfaceClass.getName());
                if (i != interfaces.length - 1) {
                    sb.append(",");
                }
            }

            sb.append("{\n");

            Field[] fields = stringClass.getDeclaredFields();
            for (Field field : fields) {
                sb.append("\t");
                sb.append(Modifier.toString(field.getModifiers()));
                sb.append(" ");
                sb.append(field.getType().getName());
                sb.append(" ");
                sb.append(field.getName());
                sb.append("; \n");
            }

            sb.append("}");

            // 输出
            System.out.println(sb);
        }
    }
}
