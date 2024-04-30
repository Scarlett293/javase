package src.com.powernode.javase.systemtest;

/**
 * time :2024/4/15 21:22 12
 * ClassName :SystemTest
 * Package :src.com.powernode.javase.systemtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * java.lang.System 系统类
 */
public class SystemTest {
    public static void main(String[] args) {


        // 标准的错误输出
        System.err.println("这是一个错误信息");

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch(ArithmeticException e) {
            System.err.println("整除不能为0");

        }

        System.out.println("hello world!");

        PrintStream printStream = System.out;
        printStream.println(100);
        printStream.println(false);
        printStream.println("123");
        printStream.println(1.23);

        Scanner s = new Scanner(System.in);

        InputStream inputStream = System.in;
        Scanner s2 = new Scanner(inputStream);
        System.out.println(s2.next());
    }
}
