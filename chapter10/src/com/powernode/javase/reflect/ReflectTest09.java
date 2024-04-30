package com.powernode.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest09
 * @Date: 2024/4/23 19:53 30
 */


public class ReflectTest09 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Class stringClass = Class.forName("java.lang.String");
        sb.append(Modifier.toString(stringClass.getModifiers()));
        sb.append(" class ");
        sb.append(stringClass.getName());
        sb.append(" extends ");
        sb.append(stringClass.getSuperclass().getName());
        Class[] interfaces = stringClass.getInterfaces();
        if(interfaces.length > 0) {
            sb.append(" implements ");
            for (int i = 0; i < interfaces.length; i++) {
                sb.append(interfaces[i].getName());
                if(i != interfaces.length - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("{\n");
        Method[] methods = stringClass.getDeclaredMethods();
        for(Method method : methods ) {
            sb.append("\t");
            sb.append(Modifier.toString(method.getModifiers()));
            sb.append(" ");
            sb.append(method.getReturnType().getName());
            sb.append(" ");
            sb.append(method.getName());
            sb.append("(");
            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                Parameter parameter = parameters[i];
                sb.append(parameter.getType().getName());
                sb.append(" ");
                sb.append(parameter.getName());
                if(i != parameters.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("){}\n");
        }
        sb.append("}");

        System.out.println(sb);
    }
}
