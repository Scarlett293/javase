package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest05
 * @Date: 2024/4/23 17:18 05
 */
public class ReflectTest05 {
    public static void main(String[] args) {
        Class c = "动力节点".getClass();

        // 获取类型名
        System.out.println(c.getName());

        System.out.println(c.getSimpleName());
    }
}
