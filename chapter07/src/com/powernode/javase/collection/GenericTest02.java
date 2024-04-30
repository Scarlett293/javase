package com.powernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: GenericTest02
 * @Date: 2024/4/17 16:33 25
 */
public class GenericTest02 {
    public static void main(String[] args) {
        // Collection<User> users = new ArrayList<User>();
        Collection<User> users = new ArrayList<>();

        // 向集合中添加user对象

        // 创建User类型的对象
        User u1 = new User("张三");
        User u2 = new User("李四");
        User u3 = new User("王五");

        // 添加到集合中
        users.add(u1);
        users.add(u2);
        users.add(u3);

        // 编译器报错，不能添加其他类型，只能添加User类型
        // users.add("abc");

        Iterator<User> it = users.iterator();
        while(it.hasNext()) {
            User user = it.next();
            user.pay();
        }


        // Collection<String> strs = new ArrayList<String>();
        // java7的新特性，钻石表达式
        Collection<String> strs = new ArrayList<>();
        strs.add("jack");
        strs.add("lisi");
        strs.add("lucy");
        strs.add("tom");


        Iterator<String> it2 = strs.iterator();

        while(it2.hasNext()) {
            String str = it2.next();
            System.out.println(str.charAt(1));
        }

    }
}
