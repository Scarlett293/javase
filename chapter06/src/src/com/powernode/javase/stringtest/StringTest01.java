package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/13 19:57 53
 * ClassName :StringTest01
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 在java程序当中，凡是带有双引号的字符串，在编译阶段就已经完全确定了，这种字符串在字面量将来会在字符串常量池中
 * 在JVM启动的时候，会进行一系列初始化，其中就包括字符串常量池的初始化，在初始化字符串常量池的时候，会将所有
 * 字符串字面量全部提前从黄建好
 */
public class StringTest01 {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = new String("hello");
//


        // s1是一个引用，保存了对象的内存地址
        String s1 = "hello";
        // s2是一个引用，保存了对象的内存地址
        String s2 = "hello";


        System.out.println(s1 == s2); // true

        String s3 = "test";
        String s4 = new String("test");

        // 比较两个字符串是否相等，
        System.out.println(s3.equals(s4));


        String x = "helloworld";
        x = "其他字符串";

    }
}
