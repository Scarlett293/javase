package com.powernode.javase.reflect;

import java.lang.reflect.Method;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: RefletTest10
 * @Date: 2024/4/23 20:07 50
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        boolean isSuccess = userService.login("admin", "123456");
        System.out.println(isSuccess ? "成功" : "失败");
        userService.logout();

        //
        Class clazz = Class.forName("com.powernode.javase.reflect.UserService");
        Method loginMethod = clazz.getDeclaredMethod("login", String.class, String.class);
        Object returnValue = loginMethod.invoke(userService, "admin", "123456");
        System.out.println(returnValue);

        Method logout = clazz.getDeclaredMethod("logout");
        logout.invoke(userService);
    }
}
