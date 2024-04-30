package src.com.powernode.javase.bignumtest;

/**
 * time :2024/4/15 11:55 42
 * ClassName :BigNumTest02
 * Package :src.com.powernode.javase.bignumtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * java.math.BigDecimal 大浮点数字，经常用在财务软件当中
 */
public class BigNumTest02 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10");
        BigDecimal num2 = new BigDecimal("2");


        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.divide(num2));

        BigDecimal num3 = new BigDecimal("123456789.123456789");
        System.out.println(num3.movePointLeft(3));

        System.out.println(num3.movePointRight(3));
    }
}
