package com.powernode.javase.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest01
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/26 22:00
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // 注意，这个流属于顺序流，本质上是单线程的。数据量如果不是很多，采用这种方式。
        Stream<Integer> stream = list.stream();
        // java.util.stream.ReferencePipeline$Head@b4c966a
        // 通过Stream对象可以对集合中的元素进行计算。
        System.out.println(stream);

        // 这是一个并行流（底层自动启动多线程，你不需要管，程序员不需要干涉）
        // 在计算的时候自动会启动多线程去运算。
        // 什么时候用？如果数据量非常庞大。
        Stream<Integer> parallelStream = list.parallelStream();
        System.out.println(parallelStream);
    }
}
