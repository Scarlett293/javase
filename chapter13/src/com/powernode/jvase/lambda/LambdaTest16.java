package com.powernode.jvase.lambda;

import java.util.function.Function;

/**
 * ClassName: LambdaTest16
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 20:34
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest16 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        // 使用转换型的函数式接口
        Function<String, Person> function = new Function<String, Person>() {
            @Override
            public Person apply(String name) {
                return new Person(name);
            }
        };
        System.out.println(function.apply("张三"));
        // Lambda表达式的形式
        Function<String, Person> function1 = name -> new Person(name);
        System.out.println(function1.apply("李四"));
        // 使用 构造方法引用 精简
        Function<String, Person> function2 = Person::new;
        System.out.println(function1.apply("李四"));
    }
}

class Person {
    private String name;
    public Person(String name) {
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
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
