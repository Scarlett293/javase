package src.com.powernode.javase.stringbuildertest;

import org.junit.jupiter.api.Test;

/**
 * time :2024/4/14 22:34 07
 * ClassName :StringBuilderTest
 * Package :src.com.powernode.javase.stringbuildertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringBuilderTest {
    @Test
    public void testSetLength() {
        StringBuilder s = new StringBuilder();
        s.append("11111111111111111");
        System.out.println(s);

        // 谨慎使用，会把已由的数据抹掉
        s.setLength(3);
        System.out.println(s);
    }
    @Test
    public void testSetCahrAt() {
        StringBuilder s = new StringBuilder();
        s.append(10);
        s.setCharAt(0, 'A');
        System.out.println(s);
    }

    @Test
    public void testReverse() {
        StringBuilder s = new StringBuilder();
        s.append(10);
        s.append("abc");
        s.insert(3, "helloworld");
        System.out.println(s);
        s.replace(3, "helloworld".length(), "动力节点");
        System.out.println(s);
        s.reverse();
        System.out.println(s);

    }
    @Test
    public void testReplace() {
        StringBuilder s = new StringBuilder();
        s.append(10);
        s.append("abc");
        s.insert(3, "helloworld");
        System.out.println(s);
        s.replace(3, "helloworld".length(), "动力节点");

        System.out.println(s);
    }


    @Test
    public void testInsert() {
        StringBuilder s = new StringBuilder();
        s.append(10);
        s.append("abc");

        s.insert(3, "helloworld");
        System.out.println(s);
    }


    @Test
    public void testDelete() {
        StringBuilder s = new StringBuilder();
        s.append(10);
        s.append("abc");
        s.append(new Object());
        s.append(false);
        s.append(3.14);

        s.delete(3, 5);
        s.deleteCharAt(0);
        System.out.println(s);
    }



    @Test
    public void testAppend() {
        StringBuilder s = new StringBuilder();
        s.append(10);
        s.append("abc");
        s.append(new Object());
        s.append(false);
        s.append(3.14);

        System.out.println(s.toString());
    }
}
