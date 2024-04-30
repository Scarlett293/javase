package com.powernode.javase.reflect;

/**
 * @author :29369
 * @Package: com.powernode.javase.reflect
 * @ClassName: UserService
 * @Date: 2024/4/23 19:26 45
 */
public class UserService {
    /**
     * 用户登录方法
     * @param username 用户名
     * @param password 密码
     * @return 登录结果
     */
    public boolean login(String username, String password) {
        if("admin".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }

    public String concat(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    /**
     * 退出系统的方法
     */
    public void logout() {
        System.out.println("系统已经安全退出");
    }


}
