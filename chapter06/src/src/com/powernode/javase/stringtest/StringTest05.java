package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/14 19:54 34
 * ClassName :StringTest05
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest05 {
    public static void main(String[] args) {
        String s = "helaloa";
        String newStr = reverse(s);
        System.out.println(s + "反转后的结果是" + newStr);
    }

    private static String reverse(String s) {
        char[] chars = s.toCharArray();
        // 将s转换成char数组，然后将数组反转，然后返回String
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = ' ';
            temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
