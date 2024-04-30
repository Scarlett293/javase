package com.powernode.javase.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest16
 * Decription:
 * Package: com.powernode.javase.stream
 * Date: 2024/4/27 22:13
 * Author: Scalett
 * Version: 1.0
 */
public class StreamAPITest16 {
    public static void main(String[] args) {
        // 没有指定数组的类型时，默认转换成Object[]数组。
        Object[] array = Stream.of(1, 2, 3, 4).toArray();
        System.out.println(Arrays.toString(array));
        // 转换成指定类型的数组
        Integer[] array1 = Stream.of(1, 2, 3, 4).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        String[] array2 = Stream.of("a", "b", "c").toArray(String[]::new);
        System.out.println(Arrays.toString(array2));
    }
}
