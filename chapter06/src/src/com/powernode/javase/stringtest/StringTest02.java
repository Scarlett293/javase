package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/13 20:56 54
 * ClassName :StringTest02
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 使用 + 进行拼接生成的新字符串不会被放到字符串常量池中。 （+两边至少有一个是变量）
 * 当 + 两边都是字符串字面量的时候，编译器会进行自动优化，在编译阶段进行拼接
 */
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;
        String s4 = "abcdef";


        // s3指向的对象，没有在字符串常量池中，在堆中
        // 底层实际上在进行 + 的时候，会创建一个StringBuilder对象，进行字符串的拼接
        // 最后的时候会调用StringBuilder对象的toString()方法，再将StringBuilder
        // 转换成String对象
        System.out.println(s3 == s4); // false



        // 以下程序中 + 两边都是字符串字面量，这种情况下javau对其进行优化
        // 在编译的时候就完成了字符串的拼接
//        String x = "java" + "test"; // 等同于：String x = "javatest"
//        String y = "javatest";
//        System.out.println(x == y); // true

        // 以上程序中s3指向了堆中的一个字符串对象，并没有在常量池中。
        // 如果这个字符串使用比较频繁，希望将其加入到字符串常量池中，怎么办？
        String s5 = s3.intern();
        System.out.println(s4 == s5); // true


        String m = "m";
        String f = m + "e";
        String str = f.intern(); // 将"me"放入字符串常量池中，并且将"me"对象的地址返回。

        System.out.println(str == "me");

    }
}
