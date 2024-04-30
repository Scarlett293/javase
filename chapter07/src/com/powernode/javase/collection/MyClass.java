package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: MyClass
 * @Date: 2024/4/17 16:49 21
 */

/**
 * 在类上自定义泛型
 */
public class MyClass<ddwadwda> { // 这一行代码的作用是：表示在类声明的时候，给类声明/定义一个泛型
    private ddwadwda name;

    public MyClass(ddwadwda name) {
        this.name = name;
    }

    public ddwadwda getName() {
        return name;
    }

    public void setName(ddwadwda name) {
        this.name = name;
    }

    public static void main(String[] args) {

        MyClass<String> myclass1 = new MyClass<>("zhangsan");
        // MyClass<String> myclass2 = new MyClass<>(100);
        MyClass<Integer> myclass2 = new MyClass<>(100);

    }
}
