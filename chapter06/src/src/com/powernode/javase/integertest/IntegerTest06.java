package src.com.powernode.javase.integertest;

/**
 * time :2024/4/15 11:33 48
 * ClassName :IntegerTest06
 * Package :src.com.powernode.javase.integertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntegerTest06 {
    public static void main(String[] args) {
        Integer x = 10000;
        Integer y = 10000;
        System.out.println(x == y); // false


        // 整数型常量池
        // [-128, 127] 这些数字太常用了
        // 为了提高效率，Java提供了一个整数型常量池
        // 这个数组中存储了256个Integer的引用
        // 只要没有超出这个范围的数字，直接从整数型常量池中取
        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b); // true
    }
}
