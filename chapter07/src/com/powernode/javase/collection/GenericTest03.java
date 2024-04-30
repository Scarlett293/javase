package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: GenericTest03
 * @Date: 2024/4/17 17:16 25
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 注意：以下讲解内容是泛型通配符，这个是站在使用
 */
public class GenericTest03 {
    public static void print(ArrayList<?> list) {

    }

    public static void print2(ArrayList<? extends Number> list) {

    }

    public static void print3(ArrayList<? super String> list) {

    }

    public static void print4(ArrayList<? super B> list) {

    }


    public static void main(String[] args) {
        print(new ArrayList<String>());
        print(new ArrayList<Object>());
        print(new ArrayList<Integer>());
        print(new ArrayList<User>());

        print2(new ArrayList<Integer>());
        print2(new ArrayList<Double>());
        print2(new ArrayList<Byte>());
        // print2(new ArrayList<String>());

        print3(new ArrayList<Object>());
        print3(new ArrayList<String>());
        print3(new ArrayList<Object>());


        print4(new ArrayList<B>());
        print4(new ArrayList<A>());
        // print4(new ArrayList<C>());
    }
}

class A {

}
class B extends A {

}

class C extends B {

}
