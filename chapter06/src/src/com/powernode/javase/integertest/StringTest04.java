package src.com.powernode.javase.integertest;

/**
 * time :2024/4/15 11:14 35
 * ClassName :StringTest04
 * Package :src.com.powernode.javase.integertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * String，int，Integer 三种类型之间的转换
 */
public class StringTest04 {
    public static void main(String[] args) {
        // String ---> int
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 1);

        // int ---> String
        int i2 = 123;;
        String s2 = i2 + "";
        System.out.println(s2 + 1); //"1231"

        // 第二种
        String s3 = Integer.toString(i2);
        System.out.println(s3 + 1); // "1231"


        // String ---> Integer
        String s4 = "123";
        Integer i3 = Integer.valueOf(s4);

        // Integer ---> String
        String s5 = String.valueOf(i3);


        // int --->     Integer
        int i4 = 100;
        Integer i5 = Integer.valueOf(i4);
        // Integer ---> int
        int i6 = i5.intValue();
    }
}
