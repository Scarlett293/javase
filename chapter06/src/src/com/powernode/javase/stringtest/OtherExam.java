package src.com.powernode.javase.stringtest;

import org.junit.jupiter.api.Test;

/**
 * time :2024/4/14 19:36 27
 * ClassName :OtherExam
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OtherExam {




    static int a = method();
    static int b = 10;

    public static int method() {
        return b;
    }

    @Test
    public void test3() {
        System.out.println(a); // 0
    }

    @Test
    public void test2() {
        m(null); // String
    }

    public void m(Object o) {
        System.out.println("Object...");
    }

    public void m(String o) {
        System.out.println("String...");
    }

    @Test
    public void test1() {
        System.out.println(get()); // false
    }

    public static boolean get() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
