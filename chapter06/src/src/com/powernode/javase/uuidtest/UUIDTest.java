package src.com.powernode.javase.uuidtest;

/**
 * time :2024/4/15 22:23 06
 * ClassName :UUIDTest
 * Package :src.com.powernode.javase.uuidtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.util.UUID;

/**
 * 使用java中的java.util.UUID工具类生成一个具有全球唯一性地标识
 */
public class UUIDTest {
    public static void main(String[] args) {
        // 获取UUID对象
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        System.out.println(s);


        String upperCase = s.replaceAll("-", "").toUpperCase();
        System.out.println(upperCase);
    }
}
