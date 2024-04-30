package com.powernode.jvase.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: LambdaTest03
 * Decription:
 * Package: com.powernode.jvase.lambda
 * Date: 2024/4/26 18:28
 * Author: Scalett
 * Version: 1.0
 */
public class LambdaTest03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300, 250);

        // 对List元素中的集合排序
        Collections.sort(list);

/*        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/


        // Collections.sort(list, (o1, o2) -> o2 - o1);

        Comparator<Integer> comparator = (Integer a, Integer b) -> { return b - a; };
        Collections.sort(list, comparator);


        // 输出排序后的
        System.out.println(list);
    }
}
