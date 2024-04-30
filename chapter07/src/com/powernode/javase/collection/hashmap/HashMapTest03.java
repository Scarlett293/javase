package com.powernode.javase.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.hashmap
 * @ClassName: HashMapTest03
 * @Date: 2024/4/19 10:22 41
 */

/**
 * 测试：HashMap集合的容量是否一直都是2的2倍
 *      第一：提高哈希计算的效率（位运算肯定比%驱魔操作速度快）
 *      第二：减少哈希冲突，让散列分布更加均匀。
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        int length = (int)Math.pow(2, 11);
        System.out.println(length);

        // 使用取模 % 进行哈希计算
        int hash = "张三".hashCode();
        int index = hash % length;
        System.out.println(index); // 745

        // 使用&进行哈希计算

        /*
        假设length是偶数，length - 1 一定是奇数
        hash & length - 1， length - 1 是奇数
        奇数的二进制位最后一位一定是1
        length - 1计算之后的结果对应的二进制位最低位一定是1
        也就是xxxxxxxxxxxx1
        然后拿着这个二进制位的hash进行与操作
        hash可能的二进制位是：
        yyyyyyyyyyyyy0
        也可能是
        yyyyyyyyyyyyy1
        --------------
        zzzzzzzzzzzzz1
        zzzzzzzzzzzzz0

        假设length是奇数，那么length-1一定是偶数
        它一定是：xxxxxxxxxxxxxxxxxx0
        hash值可能是：yyyyyyyyyyyyyyyy1
        yyyyyyyyyyyyyyyyyyy0
        
         */
        int index2 = hash & length - 1;
        System.out.println(index2);
    }
}
