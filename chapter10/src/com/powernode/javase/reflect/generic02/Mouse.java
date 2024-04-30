package com.powernode.javase.reflect.generic02;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect.generic02
 * @ClassName: Mouse
 * @Date: 2024/4/24 19:51 29
 */

public class Mouse implements Flyable<String, Integer>, Comparable<Mouse> {
    @Override
    public int compareTo(Mouse mouse) {
        return 0;
    }
}
