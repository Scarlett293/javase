package com.powernode.javase.annotation.reflect;

import java.lang.annotation.*;

/**
 * time :2024/4/25 15:16 50
 * ClassName :Annotation1
 * Package :com.powernode.javase.annotation.reflect
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Annotation1 {
    String name() default "0";
    int age() default 0;
}
