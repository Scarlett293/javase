package com.powernode.javase.moviesystem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author :29369
 * @Package: com.powernode.javase.moviesystem
 * @ClassName: UserManagerImpl
 * @Date: 2024/4/17 18:38 14
 */
public class UserManagerImpl implements UserManager {

    private static ArrayList<User> list = new ArrayList<>();

    public UserManagerImpl() {

    }

    /**
     * 输出所有用户信息
     */
    public static void print() {
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            User user = it.next();
            System.out.println(user);
        }
    }

    /**
     * 注册账户
     */
    @Override
    public void register(User user) {
        list.add(user);
    }

    /**
     * 账户登录
     *
     * @boolean 是否登录成功
     */
    @Override
    public boolean login(User user) {
        return list.contains(user);
    }
}
