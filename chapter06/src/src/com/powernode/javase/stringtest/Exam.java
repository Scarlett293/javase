package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/14 19:42 22
 * ClassName :Exam
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 面试题：代码的执行顺序
 */
public class Exam {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    private static A a = new B();
    static {
        System.out.println("A的静态代码块执行了");
    }
    {
        System.out.println("A的构造代码块执行了");
    }
    public A() {
        System.out.println("A的构造方法执行了");
    }
}

class B extends A {
    static {
        System.out.println("B的静态代码块执行了");
    }
    {
        System.out.println("B的构造代码块执行了");
    }
    public B () {
        System.out.println("B的构造代码块执行了");
    }
}
