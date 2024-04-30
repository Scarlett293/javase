package src.com.powernode.javase.integertest;

/**
 * time :2024/4/15 10:44 04
 * ClassName :IntegerTest03
 * Package :src.com.powernode.javase.integertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 关于包装类的构造方法
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        // 创建一个Integer对象
        int i = 100;
        Integer i1 = new Integer(i); // 将基本数据类型包装成引用数据类型，这个过程我们称为：装箱 boxing

        System.out.println(i1);

        //Integer i2 = new Integer("100");

        //Integer i3 = new Integer("abc");

        // 非常常见的异常：java.lang.NumberFormatException
        //System.out.println(i3);

        // System.out.println(i2);


        // 装箱
        Boolean flag1 = new Boolean(true);
        Boolean flag2 = new Boolean("true");
        Boolean flag3 = new Boolean("True");
        Boolean flag4 = new Boolean("TRUE");
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);


    }
}
