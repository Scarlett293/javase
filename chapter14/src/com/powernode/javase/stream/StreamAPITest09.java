package com.powernode.javase.stream;

import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest09
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 13:45
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest09 {
    public static void main(String[] args) {
        // 从索引为3的位置开始截取3个元素
        Stream.of(1,2,3,4,5,6,7,8,9,10).skip(3).limit(3).forEach(System.out::println);
    }
}
