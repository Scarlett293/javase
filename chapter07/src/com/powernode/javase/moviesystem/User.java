package com.powernode.javase.moviesystem;

/**
 * @author :29369
 * @Package: com.powernode.javase.moviesystem
 * @ClassName: User
 * @Date: 2024/4/17 18:18 16
 */

import java.util.ArrayList;

/**
 * 用户类
 */
public class User {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;

    /**
     * 观看记录
     */
    private ArrayList<?> watch;

    /**
     * 是否为管理员？
     */
    private boolean GM;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<?> getWatch() {
        return watch;
    }

    public void setWatch(ArrayList<?> watch) {
        this.watch = watch;
    }

    public boolean isGM() {
        return GM;
    }

    public void setGM(boolean GM) {
        this.GM = GM;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", watch=" + watch +
                '}';
    }
}
