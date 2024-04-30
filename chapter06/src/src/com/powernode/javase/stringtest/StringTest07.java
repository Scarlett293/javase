package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/14 20:07 34
 * ClassName :StringTest07
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 从身份证中读取信息，要求读出这个人的生日以及性别
 * 7-14是生日
 * 倒数第二位是性别，奇数表示男，偶数表示女
 */
public class StringTest07 {
    public static void main(String[] args) {
        String idCard = "111111199012111234";
        String birth = idCard.substring(6, 14);
        System.out.println("生日：" + birth);

        // 性别
        int c = idCard.charAt(16);
        System.out.println(c % 2 == 0 ? "女" : "男");
    }
}
