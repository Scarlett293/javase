package com.powernode.javase.annotation.meta4;

import java.lang.annotation.Repeatable;

/**
 * time :2024/4/25 15:12 49
 * ClassName :Author
 * Package :com.powernode.javase.annotation.meta4
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

@Repeatable(Authors.class)
public @interface Author {
    /**
     * 作者的名字
     * @return 作者的名字
     */
    String name();
}
