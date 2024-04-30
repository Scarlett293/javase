package com.powernode.javase.io;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: LoadProperties
 * @Date: 2024/4/21 20:50 20
 */
public class LoadProperties {
    public static void main(String[] args) throws Exception {
        // FileReader reader = new FileReader("chapter08/src/jdbc.properties");
        String path = Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath();
        FileReader reader = new FileReader(path);

        // 创建一个Map集合（属性类对象）
        Properties pro = new Properties();


        // 加载
        pro.load(reader);

/*        Enumeration<?> names = pro.propertyNames();

        while (names.hasMoreElements()) {
            String name = (String)names.nextElement();
            String value = pro.getProperty(name);
            System.out.println(name + "=" + value);

        }*/

        String driver = pro.getProperty("driver");
        String url = pro.getProperty("url");
        String user = pro.getProperty("user");
        String password = pro.getProperty("password");


        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(password);



        // 给
        reader.close();
    }
}
