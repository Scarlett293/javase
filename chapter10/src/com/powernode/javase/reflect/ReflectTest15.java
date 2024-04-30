package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest15
 * @Date: 2024/4/24 19:25 22
 */
public class ReflectTest15 {
    public static void main(String[] args) {
        ClassLoader appClassLoader = ReflectTest15.class.getClassLoader();
        System.out.println("应用类加载器：" + appClassLoader);

        ClassLoader appClassLoader2 = ClassLoader.getSystemClassLoader();
        System.out.println("应用类加载器：" + appClassLoader2);

        // 通过getParent()方法开业i获取当前类加载器的“父 类加载器”
        System.out.println("平台类加载器：" + appClassLoader.getParent());

    }
}
