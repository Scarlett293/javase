package com.powernode.javase.stream;

import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest03
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 11:00
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest03 {
    public static void main(String[] args) {
        // java.util.stream.ReferencePipeline$Head@b4c966a
        // stream是一个顺序流，单线程
        Stream<String> stream = Stream.of("abc", "def", "xyz");
        System.out.println(stream);
        System.out.println(stream.isParallel()); // false
        // 转换为并行流
        Stream<String> parallel = stream.parallel();
        System.out.println(parallel);
        System.out.println(stream == parallel); // true
        System.out.println(parallel.isParallel()); // true

        // java.util.stream.ReferencePipeline$Head@2f4d3709
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        System.out.println(integerStream);
    }
}
