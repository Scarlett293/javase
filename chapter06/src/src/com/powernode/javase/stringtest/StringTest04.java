package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/14 19:49 54
 * ClassName :StringTest04
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest04 {
    public static void main(String[] args) {
        String s = "Ab1cd2Ef3G4H5wwDADfawfdasd342342342352";
        char[] chars = s.toCharArray();
        // 定义计数器
        int bigCount = 0, smallCount = 0, numCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <='9') {
                numCount++;
            }
        }
        System.out.println("大写字母个数" + bigCount);
        System.out.println("小写字母个数" + smallCount);
        System.out.println("数字个数" + numCount);
    }
}
