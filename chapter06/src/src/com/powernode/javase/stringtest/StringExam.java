package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/14 19:22 29
 * ClassName :StringExam
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import org.junit.jupiter.api.Test;

/**
 * String类常见的面试题
 */
public class StringExam {

    @Test
    public void test10() {
        String s1 = new String("abc");
        System.out.println(s1); // abc

        StringBuilder s2 = new StringBuilder("abc");
        System.out.println(s2); // abc

        // equals里有一个规则，类型一样才会比较

        System.out.println(s1.equals(s2)); // false
    }
    @Test
    public void test9() {
        String s1 = "a1";
        String s2 = "a" + 1;
        System.out.println(s1 == s2); // true
    }

    @Test
    public void test8() {
        String s1 = "ab";
        final String s2 = getB();
        String s3 = "a" + s2;
        System.out.println(s1 == s3); // false
    }

    public String getB() {
        return "b";
    }

    @Test
    public void test7() {
        String s1 = "ab";
        final String s2 = "b";
        String s3 = "a" + s2;
        System.out.println(s1 == s3); // true
    }

    @Test
    public void test6() {

        // 不会出现异常
        String s1 = null;
        String s2 = s1 + null;
        System.out.println(s2); // nullnull
    }

    @Test
    public void test5() {
        // 字符串常量池中2个，堆中4个（StringBuilder和String）
        String s = new String("a") + new String("b");
    }

    @Test
    public void test4() {
        // 问题：创建了几个对象
        // 字符串常量池中1个
        String s1 = "a";

        // 字符串常量池中1个，堆1个
        String s2 = new String("b");
        // 堆中2个，（StringBuilder对象，String对象）
        String s3 = s1 + s2;

    }


    @Test
    public void test3() {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";

        System.out.println(s1 == s3); // false

        System.out.println(s1.equals(s3)); // true
    }


    @Test
    public void test2() {
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2); // true
    }

    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
