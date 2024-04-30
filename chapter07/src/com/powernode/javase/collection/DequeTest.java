package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: DequeTest
 * @Date: 2024/4/18 20:09 46
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * java.util.ArrayDeque
 * java.util.LinkedList
 * 以上两个类都实现了双端队列
 */
public class DequeTest {
    public static void main(String[] args) {
        // 队尾进，队头出
        // 床年间双端队列对象
        Deque<String> deque1 = new ArrayDeque<>();
        deque1.offerLast("1");
        deque1.offerLast("2");
        deque1.offerLast("3");
        deque1.offerLast("4");

        System.out.println(deque1.pollFirst());
        System.out.println(deque1.pollFirst());
        System.out.println(deque1.pollFirst());
        System.out.println(deque1.pollFirst());

        // 队头进 队尾出
        deque1.offerFirst("a");
        deque1.offerFirst("b");
        deque1.offerFirst("c");
        deque1.offerFirst("d");

        System.out.println(deque1.pollLast());
        System.out.println(deque1.pollLast());
        System.out.println(deque1.pollLast());
        System.out.println(deque1.pollLast());
    }
}
