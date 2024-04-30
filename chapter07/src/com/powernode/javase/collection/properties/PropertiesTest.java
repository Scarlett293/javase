package com.powernode.javase.collection.properties;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.properties
 * @ClassName: PropertiesTest
 * @Date: 2024/4/19 18:39 03
 */

import java.util.Enumeration;
import java.util.Properties;

/**
 * 这里先作为了解。因为后面有IO流当中还是需要Properties的，到那个时候就理解了
 * 2. java.util.Properties，我们一般叫做：属性类
 * 3. Properties继承Hashtable，所以Properties也是线程安全的，Properties也是一个Map集合
 * 4. Properties属性类一般和java程序中的属性配置文件联合使用，属性配置文件的扩展名是：xxxxx.properties
 * 5. Properties类不支持泛型，key和value是固定类型，都是String类型
 * 6. 目前需要掌握的Properties三个方法：
 *      String value = (String)names.getProperty("name");
 *      pro.setProperty("name", "value");
 *      Enumeration name = pro.propertyNames();
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();

        // 往属性类对象中存储 key和value，类似于map.put(k, v)
        pro.setProperty("jdbc.driver", "com.mysql.jdbc.Driver");
        pro.setProperty("jdbc.user", "root");
        pro.setProperty("jdbc.password", "123123");
        pro.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/powernode");

        String driver = pro.getProperty("jdbc.driver");
        String user = pro.getProperty("jdbc.user");
        String password = pro.getProperty("jdbc.password");
        String url = pro.getProperty("jdbc.url");

        System.out.println(driver);
        System.out.println(user);
        System.out.println(password);
        System.out.println(url);

        // 获取所有的key
        Enumeration<?> names = pro.propertyNames();
        while(names.hasMoreElements()) {
            String name = (String)names.nextElement();
            String value = pro.getProperty(name);
            System.out.println(name + "=" + value);
        }

    }
}
