package com.powernode.javase.collection.set;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.set
 * @ClassName: TreeSet
 * @Date: 2024/4/19 21:45 57
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet不能存储null
 * TreeSet特点：有序不可重复
 * 不可重复：hashCode + equals需要重写
 * TreeSet集合有序：可排序
 *
 *
 * 两种排序方式
 *      第一种：存放在HashSet集合中的元素实现java.lang.Comparable接口
 *      第二种：创建HashSet集合的时候，给构造方法传递一个比较器，java.util.Comparator的实现类
 */
public class TreeSetTest {
    public static void main(String[] args) {
/*        Set<Vip> vips = new TreeSet<>();

        vips.add(new Vip("123451", "张三1", 20));
        vips.add(new Vip("123452", "张三2", 21));
        vips.add(new Vip("123453", "张三3", 19));
        vips.add(new Vip("123454", "张三4", 18));
        vips.add(new Vip("123455", "张三5", 50));
        for (Vip vip : vips) {
            System.out.println(vip);
        }*/



        Set<Vip> vips2 = new TreeSet<>(new Comparator<Vip>() {
            @Override
            public int compare(Vip o1, Vip o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        vips2.add(new Vip("123451", "张三1", 20));
        vips2.add(new Vip("123452", "张三2", 21));
        vips2.add(new Vip("123453", "张三3", 19));
        vips2.add(new Vip("123454", "张三4", 18));
        vips2.add(new Vip("123455", "张三5", 50));
        for (Vip vip : vips2) {
            System.out.println(vip);
        }



    }

}
