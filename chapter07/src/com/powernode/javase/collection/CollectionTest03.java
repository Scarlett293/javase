package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: CollectionTest03
 * @Date: 2024/4/17 15:38 00
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 关于Collection集合的迭代器迭代方式/遍历方式
 *      1. 以下遍历方式适用于所有Collection的子，通用的
 *      2. 遍历其实本质上就是将集合中的每一个元素逐一获取到
 *      3. 怎么遍历/迭代？ 3步
 *          第一步：获取集合依赖的迭代器对象
 *              Iterator it = collection.iterator();
 *          第二步：
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        // 创建集合对象

        // 修改成
        Collection col = new ArrayList();

        // 向集合中添加元素
        col.add("zhangsan");
        col.add("lisi");
        col.add("wangwu");
        col.add("zhapliu");
        col.add("qianqi");

        // 迭代/遍历
        // 第一步：获取迭代器
        Iterator it = col.iterator();
        System.out.println("输出迭代器：" + it);
        // 判断当前光标指向位置有没有数据
     /*   while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }*/

        // for
/*        for (Iterator it = col.iterator(); it.hasNext(); ) {
            Object obj = it.next();
            System.out.println(obj);
        }*/
    }
}
