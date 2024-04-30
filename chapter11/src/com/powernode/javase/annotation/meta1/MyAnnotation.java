package com.powernode.javase.annotation.meta1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * time :2024/4/25 14:24 00
 * ClassName :MyAnnotation
 * Package :com.powernode.javase.annotation.meta1
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
// @Retention(RetentionPolicy.SOURCE) // @MyAnnocation 注解保留在源码中
// @Retention(RetentionPolicy.CLASS) // @MyAnnocation 注解保留在字节码中，但是不能被反射
// @Retention(RetentionPolicy.RUNTIME) // @MyAnnocation 注解保留在字节码中，并且在运行时可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
