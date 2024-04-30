package com.powernode.javase.collection;

/**
 * time :2024/4/17 17:08 02
 * ClassName :MyComparable
 * Package :com.powernode.javase.collection
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 在接口上定义泛型
 * @param <T>
 */
public interface MyComparable<T> {

    int compareTo(T o);
}
