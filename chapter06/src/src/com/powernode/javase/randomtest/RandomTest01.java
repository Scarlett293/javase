package src.com.powernode.javase.randomtest;

import java.util.Random;
/**
 * time :2024/4/15 20:55 41
 * ClassName :RandomTest01
 * Package :src.com.powernode.javase.randomtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class RandomTest01 {
    public static void main(String[] args) {
        // 获取一个随机数生成器对象
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            // 生成[-2147483648 ~ 2147483647]
            int num = random.nextInt();
            System.out.println(num);
        }

        System.out.println("===================");

        // nextInt(int bound)
        // nextInt(101) 取[0, 100] 之间的随机数
        for (int i = 0; i < 10; i++) {
            // 生成[-2147483648 ~ 2147483647]
            int num = random.nextInt(101);
            System.out.println(num);
        }

        // nextDouble() [0.0 - 1.0]

        for (int i = 0; i < 10; i++) {
            // 生成[-2147483648 ~ 2147483647]
            double num = random.nextDouble();
            System.out.println(num);
        }
    }
}
