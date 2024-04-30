package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: ReflectTest02
 * @Date: 2024/4/23 16:50 22
 */
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {


        Class userClass = Class.forName("com.powernode.javase.reflect.User"); // userClass 代表的就是 User类型

        // 通过userClass来实例化User类型的对象
        User user = (User) userClass.newInstance();

        System.out.println(user);

        User user2 = (User) userClass.newInstance();

        System.out.println(user == user2); // false


    }
}
