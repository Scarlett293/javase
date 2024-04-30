package src.com.powernode.javase.enumtest02;

/**
 * time :2024/4/15 18:45 36
 * ClassName :Season
 * Package :src.com.powernode.javase.enumtest02
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 季节枚举
 * <p>
 * 枚举高级用法语法点：
 * 1，如果一个枚举类型中定义了普通类的东西，必须指定枚举值
 * 2，枚举值的定义只能出现在类体的最上面
 * 3，所有枚举值后面必须有";" 结尾
 */
public enum Season implements Eatable {

    // 定义了有参数的构造方法之后
    // 超过以下代码来调用构造方法
    // 注意枚举类的构造方法不能使用new来调用
    // 并且枚举类的构造方法只能在本类中调用。
    SPRING("春季", "春意盎然") {
        @Override
        public void eat() {
            System.out.println("春季吃苹果");
        }
    },
    SUMMER("夏季", "天太闷热") {
        @Override
        public void eat() {
            System.out.println("夏季吃西瓜");
        }
    },
    AUTUMN("秋季", "秋高气爽") {
        @Override
        public void eat() {
            System.out.println("秋季吃苹果");
        }

    },
    WINTER("冬季", "白雪皑皑") {
        @Override
        public void eat() {
            System.out.println("冬季吃苹果");
        }
    };

    // 提供属性
    private final String name;
    private final String desc;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
/*
    // 静态代码块，构造代码块
    // 静态方法，实例方法
    // 静态变量，实例变量

    static {
        System.out.println("枚举类型Season的静态代码块执行了");
    }

    {
        System.out.println("构造代码块执行了");
    }


    // 静态变量
    public final static int A = 10;
    // 实例变量
    private final int b = 20;
    // 静态方法
    public static int getA() {
        return A;
    }
    // 实例方法
    public int getB() {
        return b;
    }*/

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

/*    @Override
    public void eat() {
        System.out.println("吃啥都行");
    }*/
}
