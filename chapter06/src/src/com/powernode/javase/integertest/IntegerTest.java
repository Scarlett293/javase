package src.com.powernode.javase.integertest;

/**
 * time :2024/4/15 10:59 12
 * ClassName :IntegerTest04
 * Package :src.com.powernode.javase.integertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import org.junit.jupiter.api.Test;

/**
 * 测试Integer中的常用方法
 */
public class IntegerTest {
    @Test
    public void testBoxing() {
        int num = 100;
        Integer i1 = Integer.valueOf(num);

        Integer i2 = Integer.valueOf("100");
        // NumberFormatException
        // Integer i3 = Integer.valueOf("abc");
    }
    @Test
    public void testToString() {
        // 将基本数据类型转换成String
        String str = Integer.toString(100);
        System.out.println(str);

        // 这种方式也行
        int i = 100;
        String s = i + "";
        System.out.println(s);
    }
    @Test
    public void testUnBoxing() {
        // 装箱
        Integer i = new Integer(100);

        // 拆箱
        int num = i.intValue();
        System.out.println(num);
    }
    @Test
    public void testEqualsAndToString(){
        // Integer以及其他的包装类都已经将equals和toString重写了
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        System.out.println(a == b);

        System.out.println(a.equals(b));

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
    @Test
    public void testToJinZhi() {
        int num = 20;
        System.out.println(num + "对应的十六进制" + Integer.toHexString(num));
        System.out.println(num + "对应的二进制" + Integer.toBinaryString(num));
        System.out.println(num + "对应的八进制" + Integer.toOctalString(num));
    }
    @Test
    public void testParseInt() {
        int num1 = Integer.parseInt("123");
        double num2 = Double.parseDouble("3.14");
        long num3 = Long.parseLong("560");


        System.out.println(num1 + 1);
        System.out.println(num2 + 1);
        System.out.println(num3 + 1);
    }
    @Test
    public void testMaxAndMin() {
        int max = Integer.max(10, 20);
        System.out.println(max);
        int min = Integer.min(10, 20);
        System.out.println(min);
    }
    @Test
    public void testCompare() {
        int result = Integer.compare(20, 20);
        System.out.println(result);
    }
}
