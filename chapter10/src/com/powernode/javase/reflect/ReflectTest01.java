package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest01
 * @Date: 2024/4/23 11:58 09
 */
public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("java.lang.String");


        // 获取User类型
        Class userClass = Class.forName("com.powernode.javase.reflect.User");


        String s1 = "动力节点";
        Class stringClass = s1.getClass();

        System.out.println(stringClass == c1);

    }
}
