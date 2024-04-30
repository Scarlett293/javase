package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: Order
 * @Date: 2024/4/17 17:14 38
 */

// 第二红实现接口的方式
public class Order<T> implements MyComparable<T>{
    @Override
    public int compareTo(T o) {
        return 0;
    }
}
