package src.com.powernode.javase.enumtest02;

/**
 * time :2024/4/15 20:45 22
 * ClassName :SeasonTest
 * Package :src.com.powernode.javase.enumtest02
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SeasonTest{
    public static void main(String[] args) {
        Season season = get();

        switch (season) {
            case SPRING -> System.out.println(Season.SPRING.getDesc());
            case SUMMER -> System.out.println(Season.SUMMER.getDesc());
            case AUTUMN -> System.out.println(Season.AUTUMN.getDesc());
            case WINTER -> System.out.println(Season.WINTER.getDesc());

        }


        // 遍历
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s.getName() + "-->" + s.getDesc());
            s.eat();
        }
    }

    public static Season get() {
        return Season.SPRING;
    }
}
