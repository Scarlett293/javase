package src.com.powernode.javase.integertest;

/**
 * time :2024/4/14 23:01 22
 * ClassName :IntegerTest01
 * Package :src.com.powernode.javase.integertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 八种基本数据类型不够用吗？为什么每一种再提供对应的包装类呢？
 *      基本数据类型              包装类型
 *      ----------------------------------------
 *      byte                    java.lang.Byte
 *      short                   java.lang.Short
 *      int                     java.lang.Integer
 *      long                    java.lang.Long
 *      float                   java.lang.Float
 *      double                  java.lang.Double
 *      boolean                 java.lang.Boolean
 *      char                    java.lang.Character
 *
 *      包装类属于引用数据类型
 *
 *      为了方便开发
 */
public class IntegerTest01 {

    public static void main(String[] args) {
        int value = 10;
        // 将10进行包装，生成包装类型
        MyInteger mi  = new MyInteger(value);
        // 将包装类型转换为基本数据类型
        m(mi);
    }

    public static void m(Object obj) {

    }


}
