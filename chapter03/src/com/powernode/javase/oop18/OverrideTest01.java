package com.powernode.javase.oop18;

/**
 * time :2024/3/12 19:54 14
 * ClassName :OverrideTest01
 * Package :com.powernode.javase.oop18
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 回顾方法重载：
 * 1，什么时候靠考虑使用方法重载
 *      在一个类中，如果功能相似，可以考虑使用方法重载
 *      这样做的目的是：代码美观，方便变成。
 * 2，当前是什么条件的时候构造方法重载》
 *      条件1：在同一个类中。
 *      条件2：相同的方法名
 *      条件3：不同的参数列表
 * 3，方法重载机制属于编译阶段的功能。（方法重载机制是给编译器。
 *
 * 当子类将父类方法覆盖之后，将来子类调用方法的时候一定会使用子类的方法
 *
 */
public class OverrideTest01 {
    public static void main(String[] args) {
        Bird b = new Bird();
          b.eat();
          b.move();
    }
}
