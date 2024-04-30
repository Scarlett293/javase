package com.powernode.javase.annotation.meta2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * time :2024/4/25 14:43 54
 * ClassName :MyAnnotation
 * Package :com.powernode.javase.annotation.meta2
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
@Target({ElementType.METHOD, ElementType.TYPE}) //
public @interface MyAnnotation {
}
