package src.com.powernode.javase.stringbuildertest;

/**
 * time :2024/4/14 22:11 09
 * ClassName :StringBuilderTest01
 * Package :src.com.powernode.javase.stringbuildertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {

        // 创建一个初始化容量是16的StringBuilder对象
        StringBuilder stringBuilder = new StringBuilder();

        // 进行字符串的拼接操作
//        stringBuilder.append("hello");
//        stringBuilder.append("world");
//        stringBuilder.append(100);
//        stringBuilder.append(false);


        stringBuilder.append("1231153343413414432342342342");

        // 输出
        System.out.println(stringBuilder);

    }
}
