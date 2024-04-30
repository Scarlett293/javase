package com.powernode.javase.exception;

/**
 * time :2024/4/13 16:43 32
 * ClassName :IllegalNameException
 * Package :com.powernode.javase.exception
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 无效名字异常，当名字长度小于6位，或者大于12位，认为程序出现了异常
 *
 * 自定义异常两步：
 *      第一步，编写了类继承RuntimeException或者Exception
 *      第二步，提供两个构造方法，一个无参构造，一个带有String参数的，并且在构造方法中调用super(String)
 */
public class IllegalNameException extends Exception{
    public IllegalNameException() {
    }

    public IllegalNameException(String message) {
        super(message);
    }
}
