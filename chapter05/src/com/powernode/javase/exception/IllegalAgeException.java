package com.powernode.javase.exception;

/**
 * time :2024/4/13 16:45 58
 * ClassName :IllegalAgeException
 * Package :com.powernode.javase.exception
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 无效年龄异常
 */
public class IllegalAgeException extends Exception{

    public IllegalAgeException() {

    }

    public IllegalAgeException(String message) {
        super(message);
    }
}
