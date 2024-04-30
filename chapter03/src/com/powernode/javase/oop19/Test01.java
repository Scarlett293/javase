package com.powernode.javase.oop19;

/**
 * time :2024/3/12 22:06 13
 * ClassName :Test01
 * Package :com.powernode.javase.oop19
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 关于基本类型之间的类型转换：
 *      第一种：小容量转换成大容量，叫做自动类型转换
 *          int i = 100;
 *          long x = i;
 *      第二种：大容量转换成小容量，不能自动转换，必须添加强制类型转换符才行。叫做强制类型转换
 *          int u - (int)x;
 * 除了基本数据类型之间的类型转换之外，对于引用数据类型来说，也可以进行类型转换
 * 只不过不叫作自动类型转换和强制类型转换。我们一般叫做向上转型和向下转转型
 * 关于java中的向上转型和向下转型。
 *      向上转型（upcasting）：子 ---> 父 （可以等同看作基本类型转换）
 *      向下转型（downcasting）：父 ---> 子 （可以等同看作强制类型转换）
 *
 * 不管是向上转型还是向下转型，两种类型之间必须要有继承关系，这是最基本的大前提。
 */
public class Test01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        a1.move();

        Cat c1 = new Cat();
        c1.eat();
        c1.move();

        Bird b1 = new Bird();
        b1.eat();
        b1.move();

        /*
        向上转型(upcasting )：
            1， 子 --> 父
            2, 也可以等同看作自动转换
            3， 前提：两种类型之间要有继承关系


         */

        Animal a2 = new Cat();

        // Animal a3 = new Bird();

        /*
         java程序包括两个重要的阶段：
            第一阶段，编译阶段
                在编译的时候，编译器只知道a2的类型是Animal类型
                因此在编译的时候就会去Animal类中找move()方法。
                找到之后，绑定上去，此时发生静态绑定，能够绑定
            第二阶段，运行阶段
                在运行的时候，堆内存中真实的java对象是Cat类型
                所以move()的行为一定是Cat对象发生的。
                因此运行的时候就会自动调用Cat对象的move()方法
                这种绑定称为运行期绑定/动态绑定

            因为编译阶段是一种形态，运行的时候是另一种形态。因此得名：多态
         */
        a2.move();

        /*
        以下代码是编译错误，因为编译器只知道a2是Animal类型，去Animal类中找
        catchMouse()方法了，结果没有找到，无法完成静态绑定，编译报错
        */
        // a2.catchMouse();


        /*
         假如现在就是要a2去抓老鼠，怎么办？
         */

        // 父 --> 子

        Cat c2 = (Cat)c1; // 向下转型。

        c2.catchMouse();

        // 大前提：不管是向上还是向下，两种类型之间必须要有继承关系
        // 没有继承关系，编译器报错

        Animal x = new Cat();
        // 向下转型
        // 为什么编译的时候可以通过？ 因为x是Animal类型，Animal和Bird之间存在继承关系，语法没问题，所以通过了
        // 为什么运行的时候出现ClassCastException（类型转换异常）？ 因为运行时堆中真实对象就是Cat对象，Cat无法转换成Bird，则出现类型转换异常
        // instanceof运算符的出现，可以解决ClassCastException异常。
        /*
        instanceof 运算符的语法规则：
            1，instanceof运算符的结果一定是：true/false
            2，语法格式：
                (引用 instanceof 类型)
            3，例如：
                (a instanceof Cat)
                    true表示什么？
                        a引用指向的对象是Cat类型
                    false表示什么？
                        a引用指向的对象不是Cat类型
        */
        // Bird v = (Bird)x;


        // 做向下转型之前，为了避免ClassCastException的发生，一般建议用instanceof进行判断
        if(x instanceof Bird) {
            System.out.println("====================");
            Bird y = (Bird)x;
        }


        Animal a = new Cat();

        if(a instanceof Cat) {
            Cat cat = (Cat)a;
            cat.catchMouse();
        } else if(a instanceof Bird) {
            Bird bird = (Bird)a;
            bird.sing();
        }
    }

}
