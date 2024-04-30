package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/14 20:10 45
 * ClassName :StringTest08
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest08 {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "xyzabcdefglmnopqrstu";

        String maxSubString = getMaxSubString(s1, s2);
        System.out.println(maxSubString);
    }

    private static String getMaxSubString(String s1, String s2) {
        // 记录下来两个字符串的长度
        int n1 = s1.length();
        int n2 = s2.length();

        // 把最大相同的子字符串的长度记录下来 maxLen
        // 把最大相同的子字符串的起始位置记录下来 start
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                // k变量是用来记录 相同子字符串的长度
                int k = 0;
                while(i + k < n1 && j + k < n2 && s1.charAt(i + k) == s2.charAt(j + k)) {
                    k++;
                }
                if(k > maxLen) {
                    maxLen = k;
                    start = i;
                }
            }
        }

        return s1.substring(start, start + maxLen);
    }
}
