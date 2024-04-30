package com.powernode.javase.collection.hashmap;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.hashmap
 * @ClassName: MyHashMap
 * @Date: 2024/4/19 08:49 50
 */

/**
 * 手写HashMap集合的put方法和get方法
 */
public class MyHashMap<K, V> {
    /**
     * 哈希表
     */
    private Node<K, V>[] table;


    /**
     * 键值对的个数
     */
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        // 注意：new数组的时候，不能使用泛型。这样写是错误的：new Node<K, V>[16];
        this.table = new Node[16];
    }

    static class Node<K, V> {
        /**
         * key的hashCode()方法的返回值
         * 哈希值，哈希码
         */
        int hash;
        /**
         * key
         */
        K key;
        /**
         * value
         */
        V value;
        /**
         * 下一个节点的内存地址
         */
        Node<K, V> next;

        /**
         * 构造一个节点对象
         *
         * @param hash  哈希值
         * @param key   key
         * @param value value
         * @param next  下一个节点
         */
        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "[" + key + ", " + value + "]";
        }
    }


    /**
     * 获取集合中键值对的个数`
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 向HashMapihe中添加一个键值对
     *
     * @param key   键
     * @param value 值
     * @return value，如果key重复，则返回oldValkue，如果不重复，则返回newValue
     */
    public V put(K key, V value) {
        if (key == null) {
            return putForNullKey(value);
        }
        // 程序运行到此处说明key不是null
        // 获取哈希值
        int hash = key.hashCode();
        // 将哈希值转换成数组的下标
        int index = Math.abs(hash % table.length);
        // 获取下标index位置的Node
        Node<K, V> node = table[index];
        if (null == node) {
            table[index] = new Node<>(hash, key, value, null);
            size++;
            return value;
        }
        // 有单向链表（遍历单向链表，尾插法）
        Node<K, V> prev = null;
        while (null != node) {
            if (node.key.equals(key)) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            prev = node;
            node = node.next;
        }
        prev.next = new Node<>(hash, key, value, null);
        size++;
        return value;
    }

    private V putForNullKey(V value) {
        Node<K, V> node = table[0];
        if (node == null) {
            table[0] = new Node<>(0, null, value, null);
            size++;
            return value;
        }
        // 程序可以执行到此处，说明下标为0的位置上有单向链表
        Node<K, V> prev = null;
        while (node != null) {
            if (node.key == null) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;

            }
            prev = node;
            node = node.next;
        }
        prev.next = new Node<>(0, null, value, null);
        size++;
        return value;
    }

    /**
     * 通过key返回value
     *
     * @param key 键
     * @return value，
     */
    public V get(K key) {
        if (null == key) {
            Node<K, V> node = table[0];
            if (null == node) {
                return null;
            }
            // 程序执行到这里，数组下标为0的位置不是null，就是有单向链表
            while (node != null) {
                if (null == node.key) {
                    return node.value;
                }
                node = node.next;
            }
        }
        // key 不是null
        int hash = key.hashCode();
        int index = Math.abs(hash % table.length);
        Node<K, V> node = table[index];
        if(null == node) {
            return null;
        }
        while(null != node) {
            if(node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    /**
     * 通过toString方法，直接输出Map集合时会调用
     *
     * @return ""
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            Node<K, V> node = table[i];
            while (node != null) {
                sb.append(node);
                node = node.next;
            }
        }
        return sb.toString();
    }
}
