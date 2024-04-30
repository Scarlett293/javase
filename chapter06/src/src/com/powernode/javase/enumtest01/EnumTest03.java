package src.com.powernode.javase.enumtest01;

/**
 * time :2024/4/15 18:41 14
 * ClassName :EnumTest03
 * Package :src.com.powernode.javase.enumtest01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class EnumTest03 {
    public static void main(String[] args) {
        // 获取所有的枚举值，遍历
        Color[] colors = Color.values();

        for (Color color : colors) {
            System.out.println(color);
        }
    }
}
