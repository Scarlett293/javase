package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: MyLinked
 * @Date: 2024/4/18 18:29 56
 */
public class MyLinked<E> {
    /**
     * 元素个数
     */
    private int size = 0;
    /**
     * 链表的头节点
     */
    private Node<E> first;

    /**
     * 构建一个空链表
     */
    public MyLinked() {

    }

    /**
     * 返回链表的长度
     * @return 长度
     */
    public int size() {
        return size;
    }


    /**
     * 向链表的末尾添加一个元素
     *
     * @param data
     */
    public void add(E data) {
        if(first == null) {
            first = new Node<>(data, null);
            return;
        }
        // 找到末尾饥饿点
        Node<E> last = findLast();
        last.next = new Node<>(data, null);
        size++;
    }

    /**
     * 找到单向链表的末尾饥饿点
     * @return 末尾饥饿点
     */
    private Node<E> findLast() {
        if(first == null) {
            // 空链表
            return null;
        }
        // 程序执行到这里，first肯定不是null，不是一个空链表
        // 假设第一个节点就是最后一个节点。
        Node<E> last = first;
        while(last.next != null) {
            last = first.next;
        }
        return first;
    }


    /**
     * 修改指定索引处的元素
     *
     * @param index
     * @param data
     */
    public void add(int index, E data) {
        // 创建新的节点对象
        Node<E> newNode = new Node<>(data, null);
        // 后期再写node(int)方法，这个方法可以根据下标找到对应的节点对象
        Node<E> prev = node(index - 1);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    /**
     * 返回索引处的节点
     * @param i 索引
     * @return 节点
     */
    private Node<E> node(int i) {
        // 假设头节点是下一个节点
        Node<E> next = first;
        for (int j = 0; j < i; j++) {
            next = next.next;
        }
        return next;
    }

    /**
     * 删除指定所以处的元素
     *
     * @param index 索引
     */
    public void remove(int index) {
        // 检查index是否越界
        // 假如删除的节点是头节点
        if(index == 0) {
            Node<E> oldFirst = first;
            first = first.next;
            oldFirst.next = null;
        }
        // 删除的不是头节点
        // 被删除的节点的上一个节点
        Node<E> prev = node(index - 1);
        // 获取被删除的那个节点
        Node<E> removed = node(index);
        prev.next = removed.next;
        removed.next = null;
        removed.item = null;
        size--;
    }


    /**
     * 修改指定索引处的数据
     * @param index 索引
     * @param data 数据
     */
    public void set(int index, E data) {
        Node<E> node = node(index);
        node.item = data;
    }

    /**
     * 根据下标获取数据
     * @param index 下标
     * @return 数据
     */
    public E get(int index) {
        return node(index).item;
    }

    /**
     * 单向链表当中的节点，建议定义为静态内部类
     */
    private static class Node<E> { // Node<String>
        /**
         * 数据
         */
        E item;
        /**
         * 下一个节点的内存地址
         */
        Node<E> next;

        /**
         * 构造一个节点对象
         * @param item 节点中的数据
         * @param next 下一个饥饿点的内存地址
         */
        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

}
