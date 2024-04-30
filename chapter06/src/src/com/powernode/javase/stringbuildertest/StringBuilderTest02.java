package src.com.powernode.javase.stringbuildertest;

/**
 * time :2024/4/14 22:24 55
 * ClassName :StringBuilderTest02
 * Package :src.com.powernode.javase.stringbuildertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder(320);
        StringBuilder stringBuilder3 = new StringBuilder("abcdef");
        StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3);

        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder3);
        System.out.println(stringBuilder4);
    }
}
