package src.com.powernode.javase.bignumtest;

/**
 * time :2024/4/15 11:43 57
 * ClassName :BigNumTest01
 * Package :src.com.powernode.javase.bignumtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import java.math.BigInteger;

/**
 * 大数字
 *      1. 超过long了怎么办？ java.math.BigInteger
 *      2. BigInteger的父类 Number
 *      3. BigInteger是引用数据类型
 */
public class BigNumTest01 {
    public static void main(String[] args) {
        // long num = 111111111111111111111111L;

        // 编译报错，超范围。


        // 创建一个大整数
        BigInteger num1 = new BigInteger("9999999999999999");

        System.out.println(num1);

        BigInteger num2 = new BigInteger("1");

        // 加法
        BigInteger result1 = num1.add(num2);

        // 减法
        BigInteger result2 = num1.subtract(num2);

        // 乘法
        BigInteger result3 = num1.multiply(num2);


        // 除法
        BigInteger result4 = num1.divide(num2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        // 
        BigInteger bigInteger = new BigInteger("2");
        BigInteger pow = bigInteger.pow(3);
        System.out.println(pow);

        BigInteger bigInteger1 = new BigInteger("9");
        BigInteger sqrt = bigInteger1.sqrt();
        System.out.println(sqrt);


    }
}
