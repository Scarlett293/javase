package com.powernode.javase.oop10;

/**
 * time :2024/3/11 13:30 14
 * ClassName :Singleton
 * Package :com.powernode.javase.oop10
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 单例模式怎么实现？
 *      第一步，构造方法私有化
 *      第二步，对外提供一个公开的静态的方法，用这个方法获取单个实例
 *      第三步，定义一个静态变量，在类加载的时候，初始化静态变量。（只初始化一次）
 *     饿汉式加载模式：类加载时，对象就创建好了。不管这个对象用还是不用，提前先把对象创建好。
 */
public class Singleton {

    private static Singleton s = new Singleton();

    private Singleton(){

    }

    public static Singleton get() {
        return s;
    }


}
