package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: StackTest
 * @Date: 2024/4/18 19:12 53
 */

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * java.util.Stack：底层是数组，线程安全的，JDK1.6不建议用了
 * java.util.ArrayDeque：底层是数组（实现LIFO的同时，又实现了双端队列）
 * java.util.LinkedList：底层是双向链表（实现LIFO的同时，又实现了双端队列。）
 * 以上三个类都实现了栈数据结构，都实现了LIFO。
 */
public class StackTest {
    public static void main(String[] args) {

        // 创建栈
        Stack<String> stack1 = new Stack<>();
        LinkedList<String> stack2 = new LinkedList<>();
        ArrayDeque stack3 = new ArrayDeque<>();


        // 压栈
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");
        stack1.push("4");
        // 弹栈
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        // search方法
        System.out.println("位置：" + stack1.search("1"));

        // 窥视
        System.out.println("此时栈顶元素是：" + stack1.peek());
        // System.out.println(stack1.pop());
        // java.util.EmptyStackException
        // System.out.println(stack1.pop());


        System.out.println("=============");
        // 压栈
        stack2.push("1");
        stack2.push("2");
        stack2.push("3");
        stack2.push("4");
        // 弹栈
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());



        System.out.println("=============");
        // 压栈
        stack3.push("1");
        stack3.push("2");
        stack3.push("3");
        stack3.push("4");
        // 弹栈
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());




    }
}
