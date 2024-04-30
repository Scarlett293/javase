package src.com.powernode.javase.systemtest;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * time :2024/4/15 21:27 44
 * ClassName :SystemTest02
 * Package :src.com.powernode.javase.systemtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SystemTest02 {
    public static void main(String[] args) {
        // 获取自1970-01-01 0:0:0 000 到系统当前时间的总毫秒数
        long l = System.currentTimeMillis();
        System.out.println(l);


        // 获取自1970-01-01 0:0:0 000 到系统当前时间的总纳秒数
        long l1 = System.nanoTime();
        System.out.println(l1);


        // 获取系统的环境变量
        Map<String, String> map = System.getenv();
        System.out.println(map.get("Path"));

        // 获取系统的所有属性
        Properties pro = System.getProperties();
        System.out.println(pro);

        System.out.println("=================");

        Enumeration<Object> keys = pro.keys();
        while(keys.hasMoreElements()) {
            Object o = keys.nextElement();
            System.out.println(o);
        }
        System.out.println("=================");

        // 根据系统属性的名字获取属性的值
        String vmName = System.getProperty("os.name");
        System.out.println(vmName);
    }
}
