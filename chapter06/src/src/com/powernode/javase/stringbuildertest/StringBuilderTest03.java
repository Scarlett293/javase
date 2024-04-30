package src.com.powernode.javase.stringbuildertest;

/**
 * time :2024/4/14 22:48 21
 * ClassName :StringBuilderTest03
 * Package :src.com.powernode.javase.stringbuildertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringBuilderTest03 {
    public static void main(String[] args) {
     /*   long begin = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin); // 3391*/

        long begin = System.currentTimeMillis();
        StringBuilder s = new StringBuilder(100000);
        for (int i = 0; i < 100000; i++) {
            s.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin); // 7
    }
}
