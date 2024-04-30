package com.powernode.javase.oop37;

/**
 * time :2024/3/27 20:12 32
 * ClassName :UserTest
 * Package :com.powernode.javase.oop37
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 关于Object类中的clone()方法
 *
 * 1. clone方法作用：对象拷贝，通常在开发中需要保护原对象的数据结构，通常赋值一份，生成一个信对象，对信对象进行操作。
 *
 * 2. Object类中的默认实现
 *      protected native Object clone() throws CloneNotSupportedException;
 *      受保护的方法，专门给子类使用的。
 *      本地方法。
 *      底层调用C++程序已经可以完成对象的创建了。
 *      我们现在要解决的问题是：怎么调用这个方法
 * 3. 怎么解决clone()方法的调用问题
 *      在子类中重写clone()方法
 *
 * 4.
 */
public class UserTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User(20);
        System.out.println(user);

        // 克隆一个user对象
        // 报错原因：因为Object类中的clone()方法是protected修饰的
        // protected修饰只能在：本类、同包、子类中访问
        // 但是以下这行和代码不满足以上所说条件
        Object obj = user.clone();
        System.out.println(obj);


        User copyUser = (User) obj;
        copyUser.setAge(100);
        System.out.println("克隆之后新对象的年龄" + copyUser.getAge());
        System.out.println("原始对象的年龄" + user.getAge());
    }
}
