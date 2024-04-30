package src.com.powernode.javase.stringtest;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * time :2024/4/13 21:44 25
 * ClassName :StringTest03
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 有一个char[]数组，可以将char[]数组转换成字符串
        char[] chars = new char[]{'动','力','节','点'};

        String s1 = new String(chars);
        System.out.println(s1);


        // 将char[]数组的一部分转换成字符串
        String s2 = new String(chars, 0, 2);
        System.out.println(s2);

        // 在一个byte[]数组，可以将byte[]数组转换成字符串
        byte[] bytes = {97, 98, 99, 100};
        // 将byte[]数组转换成字符串String，是一个解码的过程。（采用的是平台默认的字符编码方式进行的编码。）
        String s3 = new String(bytes);
        System.out.println(s3);

        // 将byte[]数组的一部分转换成了字符串（解码的过程，也是采用平台默认的字符集）
        String s4 = new String(bytes, 0, 2);
        System.out.println(s4);


        // 乱码的本织，在进行编码和解码的时候没有使用同一个编码格式
        // 先将字符串转换成byte[]数组（这个过程是一个编码的过程）
        // 这里先按照GBK的字符集进行编码。（BGK是简体中文）
        byte[] bs = "动力节点，一家只教授Java的培训机构".getBytes("UTF-8");


        // 将以上的byte[]数组转换成字符串（这个过程是一个解码的过程）
        // String s5 = new String(bs, "UTF-8");
        String s5 = new String(bs, StandardCharsets.UTF_8);
        System.out.println(s5);


        // 在不知道字符编码方式的时候，可以动态获取平台的编码方式。（使用平台默认的字符集进行编码）
        byte[] bs2 =  "动力节点".getBytes(Charset.defaultCharset());

        String s6 = new String(bs2, Charset.defaultCharset());
        System.out.println(s6);


        // 创建字符串也是可以这样做的，也是可以这样做的，但是不建议了。
        // 内在的候选方法，不建议使用了
        // 被@IntrinsicCandidate注解标注了，这个注解是Java16引入的
        // String s7 = new String("STRING"); // 底层有两个对象，一个是"STRING"在字符串常量池中，一个是在堆内存中，浪费内存。
        String s8 = "STRING";

    }
}
