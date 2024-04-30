package com.powernode.javase.annotation.reflect;

import java.lang.annotation.Annotation;

/**
 * ClassName: Test
 * Decription:
 * Package: com.powernode.javase.annotation.reflect
 * Date: 2024/4/25 15:19
 * Author: Scalett
 * Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Class<MyClass> mcClass = MyClass.class;
        //
/*        Annotation[] annotations = mcClass.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }*/


        //
        if(mcClass.isAnnotationPresent(Annotation1.class)) {
            Annotation1 a1 = mcClass.getAnnotation(Annotation1.class);
            System.out.println(a1.name());
            System.out.println(a1.age());
        }

        if(mcClass.isAnnotationPresent(Annotation2.class)) {
            Annotation2 a2 = mcClass.getAnnotation(Annotation2.class);
            System.out.println(a2.email());
            System.out.println(a2.price());
        }



    }
}
