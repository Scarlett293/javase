package com.powernode.javase.stream;

import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest08
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 13:42
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest08 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream.concat(stream1,stream2).forEach(System.out::println);
    }
}
