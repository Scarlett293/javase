package src.com.powernode.javase.enumtest01;

/**
 * time :2024/4/15 18:26 47
 * ClassName :EnumTest01
 * Package :src.com.powernode.javase.enumtest01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 以下程序不使用枚举类型
 *      两个问题：
 *          第一个问题：可读性差
 *          第二个问题：错误没有在编译阶段提醒
 *      程序的设计有一个原则：
 *          错误越早发现越好，完美的状态是，包括业务的错误尽可能在编译阶段检查出来
 */
public class EnumTest01 {
    public static void main(String[] args) {
        int i = get();
        switch(i) {
            case 1 -> System.out.println("春季");
            case 2 -> System.out.println("夏季");
            case 3 -> System.out.println("秋季");
            case 4 -> System.out.println("冬季");
        }
    }


    /**
     * 这个方法可能返回一个int类型的值
     * 1 2 3 4
     * @return
     */
    public static int get() {
        return 1;
    }
}
