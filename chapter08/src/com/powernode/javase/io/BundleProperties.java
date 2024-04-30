package com.powernode.javase.io;

import java.util.ResourceBundle;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: BundleProperties
 * @Date: 2024/4/21 21:01 29
 */
public class BundleProperties {
    public static void main(String[] args) {
        //
        // ResourceBundle bundle = ResourceBundle.getBundle("com.powernode.javase.io.jdbc");
        ResourceBundle bundle = ResourceBundle.getBundle("com.powernode.javase.io.jdbc");


        // ERROR
        // ResourceBundle bundle = ResourceBundle.getBundle("com.powernode.javase.io.jdbc.properties");


        // 通过key获取value
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(password);
    }
}
