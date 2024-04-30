package com.powernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: GenericTest01
 * @Date: 2024/4/17 16:26 04
 */

/**
 * 
 */

public class GenericTest01 {
    public static void main(String[] args) {
        // 创建集合
        Collection c = new ArrayList();

        // 创建User类型的对象
        User u1 = new User("张三");
        User u2 = new User("李四");
        User u3 = new User("王五");

        // 添加到集合中
        c.add(u1);
        c.add(u2);
        c.add(u3);

        // 遍历集合
        Iterator it = c.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            // 支付
            if(obj instanceof User) {
                User user = (User) obj;
                user.pay();
            }
        }
    }
}
