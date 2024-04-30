package com.powernode.javase;

/**
 * time :2024/4/13 19:15 42
 * ClassName :ExceptionTest10
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import com.powernode.javase.exception.IllegalAgeException;
import com.powernode.javase.exception.IllegalNameException;

/**
 * 子类继承父类之后，重写父类的方法，重写之后不能抛出更多的异常，可以更少
 */
public class ExceptionTest10 {
}

class Pet {
    public void run() throws IllegalAgeException, IllegalNameException {

    }
}

class Babbit extends Pet {


    // 正常写法
    /* @Override
    public void run() throws IllegalAgeException, IllegalNameException {

    } */

    @Override
    public void run() throws IllegalAgeException {
    }
}
