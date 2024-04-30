package com.powernode.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase
 * @ClassName: ArrayListTet01
 * @Date: 2024/4/18 11:59 24
 */
public class ArrayListTet01 {
    public static void main(String[] args) {

        // 创建一个ArrayList
        // 1. 调用ArrayList集合的无参数构造方法时：默认初始化的容量是0
        List<String> names = new ArrayList<>();

        // 向ArrayList集合中添加元素
        // 第一次调用add方法的时候，初始化容量变为10
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        names.add("zhangsan");
        //
        names.add("zhangsa11n");

        // 修改 ArrayList集合中的某个元素
        String oldData = names.set(1, "李四");
        System.out.println(oldData);

        // 插入元素
        names.add(0, "张三");

        // 删除元素
        names.remove(0);
    }
}
