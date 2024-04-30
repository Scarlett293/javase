package com.powernode.jvase.lambda;

import java.util.function.Supplier;

/**
 * ClassName: LambdaTest10
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 19:47
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest10 {
    public static void main(String[] args) {
        // 使用生产型结构：Supplier
        // 匿名内部类的方式
        Teacher teacher = new Teacher("Scalett");
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return teacher.getName();
            }
        };
        System.out.println(supplier.get());
        // 以上是否符合“实例方法引用”的条件？
        // 先修改为Lambda表达式
        Supplier<String> supplier1 = () -> teacher.getName();
        System.out.println(supplier1.get());
        // 使用“实例方法引用”精简
        Supplier<String> supplier2 = teacher::getName;
        System.out.println(supplier2.get());
    }
}
class Teacher {
    private String name;
    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
