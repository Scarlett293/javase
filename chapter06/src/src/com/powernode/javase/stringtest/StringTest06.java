package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/14 20:01 15
 * ClassName :StringTest06
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

// 获取子字符串在整个字符串中出现的次数
public class StringTest06 {
    public static void main(String[] args) {
        String s1 = "oraclejavac++mysqloraclejavapythonphporacle";
        // 统计s1字符串中字符串 "oracle" 出现的次数

        int index = 0;
        int count = 0;
        while((index = s1.indexOf("oracle")) != -1) {
            s1 = s1.substring(index + 1);
            count++;
        }

        System.out.println(count);
    }
}
