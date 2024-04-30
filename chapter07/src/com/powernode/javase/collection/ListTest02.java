package com.powernode.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: ListTest02
 * @Date: 2024/4/18 08:58 15
 */
public class ListTest02 {
    public static void main(String[] args) {
        // 创建list集合对象
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        // 在指定位置添加元素
        list.add(1, "张三");

        // 修改索引处的元素
        list.set(1, "李四");

        // 删除下标1处的元素
        list.remove(1);

        // 获取某个对象在当前集合中第一次出现的下标
        int index = list.indexOf("1");
        System.out.println("第一次出现处的下标" + index);

        // 获取某个对象在当前集合中最后一次出现处的下标
        int lastIndex = list.lastIndexOf("1");
        System.out.println("最后一次出现处的下标" + lastIndex);

        // 遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("=============");
        // 获取一个List集合
        List<String> newList = list.subList(3, 5); // (3, 5) 最终截取的下标对应的是：3,4下标
        // 遍历（对于List集合来说有特殊的遍历方式，这种方式适用于List集合家族）
        for (int i = 0; i < newList.size(); i++) {
            String s = newList.get(i);
            System.out.println(s);
        }

        // 获取一个不可修改的集合，只读的集合
        List<Integer> nums = List.of(1, 2, 3, 43, 45);

        // 尝试修改（出现异常，该集合是不可修改的）
        // nums.set(0,110); // java.lang.UnsupportedOperationException

    }
}
