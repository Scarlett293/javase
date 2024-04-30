package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: QueueTest
 * @Date: 2024/4/18 20:03 31
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * java.util.Stack：底层是数组，线程安全的，JDK1.6不建议用了
 * java.util.ArrayDeque：底层是数组（实现LIFO的同时，又实现了双端队列）
 * java.util.LinkedList：底层是双向链表（实现LIFO的同时，又实现了双端队列。）
 * 以上三个类都实现了栈数据结构，都实现了LIFO。
 */
public class QueueTest {
    public static void main(String[] args) {
        // 创建队列对象
        Queue<String> queue1 = new ArrayDeque<>();

        // 入队
        queue1.offer("1");
        queue1.offer("2");
        queue1.offer("3");
        queue1.offer("4");

        // 出队
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());


        // 创建队列对象
        Queue<String> queue2 = new LinkedList<>();
        // 入队
        queue2.offer("1");
        queue2.offer("2");
        queue2.offer("3");
        queue2.offer("4");
        // 出队
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());



    }
}
