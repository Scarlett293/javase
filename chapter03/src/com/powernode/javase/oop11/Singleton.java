package com.powernode.javase.oop11;

/**
 * time :2024/3/11 18:52 04
 * ClassName :Singleton
 * Package :com.powernode.javase.oop11
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * Singleton是单例的。
 *
 * 懒汉式单例模式：用到这个对象的时候再创建对象，别再类加载的时候创建对象
 *
 * 第一步：构造方法私有化
 * 第二步：对外提供一个静态方法
 * 第三步，提供一个静态变量，但是这个变量默认值为null
 */
public class Singleton {
    private static Singleton s;

    private Singleton(){}

    public static Singleton get(){
        if(s == null) {
            s = new Singleton();
        }
        return s;
    }
}
