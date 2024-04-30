package com.powernode.javase.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest02
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 10:37
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest02 {
    public static void main(String[] args) {
        String[] names = {"zhangsan","lisi","wangwu"};
        Stream<String> stream = Arrays.stream(names);
        System.out.println(stream);
        int[] nums = {1,2,3,4};
        IntStream stream1 = Arrays.stream(nums);
        System.out.println(stream1);
        long[] lnums = {1L,2L,3L};
        LongStream stream2 = Arrays.stream(lnums);
        System.out.println(stream2);
    }
}
