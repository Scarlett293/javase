package com.powernode.javase.newfun;

/**
 * ClassName: NewFun04
 * Decription:
 * Package: com.powernode.javase.newfun
 * Date: 2024/4/28 10:32
 * Author: Scalett
 * Version: 1.0
 */
public class NewFun04 {
    public static void main(String[] args) {
        // 不使用增强，switch怎么写？
        int month = 3;
        // 使用Java12增强后的swtitch
        switch (month) {
            case 3, 4, 5 -> System.out.println("春季");
            case 6, 7, 8 -> System.out.println("春季");
            case 9, 10, 11 -> System.out.println("春季");
            case 12, 1, 2 -> System.out.println("春季");
        }

        // Java12增强switch之后，switch语句执行结束之后可以有返回值
        String season = switch (month) {
            case 3, 4, 5 -> "春季";
            case 6, 7, 8 -> "夏季";
            case 9, 10, 11 -> "秋季";
            case 12, 1, 2 -> "冬季";
            default -> throw new RuntimeException("月份不对");
        };

        // Java13中对switch又进行了增强
        String season2 = switch (month) {
            case 3: case 4: case 5:
                yield "春季";
            case 6: case 7: case 8:
                yield "夏季";
            case 9: case 10: case 11:
                yield "秋季";
            case 12: case 1: case 2:
                yield "冬季";
            default: throw new RuntimeException("月份不对");
        };
        System.out.println(season2);
    }
}
