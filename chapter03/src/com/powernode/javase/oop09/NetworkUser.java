package com.powernode.javase.oop09;

/**
 * time :2024/3/9 21:03 31
 * ClassName :NetworkUser
 * Package :com.powernode.javase.oop09
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class NetworkUser {
    private String userId;
    private String password;
    private String email;

    public void display() {
        System.out.println("用户ID：" + this.getUserId() + ", 密码：" + this.getPassword() + ", 邮箱：" + this.getEmail());
    }

    public NetworkUser(String userId, String password, String email) {
        this.userId = userId;
        this.password = password;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
