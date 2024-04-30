package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * time :2024/4/25 15:34 10
 * ClassName :Column
 * Package :annotation
 *
 * @author :29369
 * <p>
 * 该注解用来标注一个类中的属性，被标注的属性参与建表
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    /**
     * 字段的名字
     * @return 字段的名字
     */
    String name();

    /**
     * 字段的数据类型
     * @return 字段的数据类型
     */
    String type() default "varchar";
}
