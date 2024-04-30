package src.com.powernode.javase.enumtest01;

/**
 * time :2024/4/15 18:30 39
 * ClassName :EnumTest02
 * Package :src.com.powernode.javase.enumtest01
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 使用枚举类型，分析优点：
 *      第一个优点：可读性强了
 *      第二个优点：做了类型的限定，做了类型的检查，在编译阶段就确定了类型的安全
 */
public class EnumTest02 {
    public static void main(String[] args) {

        System.out.println(Color.BLUE);
        System.out.println(Color.GREEN);
        System.out.println(Color.READ);
        Season season = get();
        switch (season) {
            case SPRING -> System.out.println("春季");
            case SUMMER -> System.out.println("夏季");
            case AUTUMN -> System.out.println("秋季");
            case WINTER -> System.out.println("冬季");
        }
    }


    /**
     * 这个方法可能返回一个int类型的值
     * 1 2 3 4
     *
     * @return
     */
    public static Season get() {
        return Season.SPRING;
    }
}
