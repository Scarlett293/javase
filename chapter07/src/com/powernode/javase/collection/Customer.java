package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: Customer
 * @Date: 2024/4/17 17:02 19
 */
public class Customer<T> {
    /*    public void shopping(T type) {
        }*/

    /**
     * 在静态方法上使用泛型之前，类型必须是提前定义之后才能使用
     * 在静态方法中定义泛型需要返回值类型前面定义/声明
     * @param type
     * @param <T>
     */
    public static<T> void shopping(T type) {
    }

    public static<E> void print(E[] elts) {
        for (E elt : elts) {
            System.out.println(elt);
        }
    }

    public static void main(String[] args) {
 /*       Customer<String> c = new Customer<>();
        c.shopping("abc");*/

        String[] strs = {"zhangsan", "lisi"};
        Customer.print(strs);
    }
}
