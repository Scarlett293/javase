package src.com.powernode.javase.mathtest;

/**
 * time :2024/4/15 18:13 19
 * ClassName :MathTest
 * Package :src.com.powernode.javase.mathtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class MathTest {

    public static void main(String[] args) {


        // 圆周率
        System.out.println("圆周率：" + Math.PI);

        // 绝对值
        int a = 100;
        int b = 396;
        System.out.println("相差: " + Math.abs(a - b));

        // 向上取整
        System.out.println(Math.ceil(1.3));

        // 向下取整
        System.out.println(Math.floor(1.999));

        // 取大值
        System.out.println(Math.max(10, 20));

        // 取小值
        System.out.println(Math.min(10, 20));

        // 四舍五入
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.6));

        // 平方根
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(10));

        // a的b次幂
        System.out.println(Math.pow(2, 2));

        System.out.println("==================");

        // 随机数
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 100));
        }
    }
}
