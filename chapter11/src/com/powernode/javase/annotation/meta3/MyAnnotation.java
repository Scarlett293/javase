package com.powernode.javase.annotation.meta3;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * time :2024/4/25 15:08 30
 * ClassName :MyAnnotation
 * Package :com.powernode.javase.annotation.meta3
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited // 表示这个MyAnnotation注解能够被继承
public @interface MyAnnotation {
}
