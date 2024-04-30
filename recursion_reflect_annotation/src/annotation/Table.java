package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: Table
 * Decription: 被 @Table 注解标注的类，要生成建表语句
 * Package: annotation
 * Date: 2024/4/25 15:32
 * Author: Scalett
 * Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    /**
     * 用来指定表的名字
     * @return 表的名字
     */
    String value();
}
