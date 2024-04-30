package com.powernode.javase.annotation;

/**
 * time :2024/4/25 12:45 31
 * ClassName :DataBaseInfo
 * Package :com.powernode.javase.annotation
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public @interface DataBaseInfo {
    String driver() default "com.mysql.cj.jdbc.Driver";

    String url();

    String user();

    String password();

    byte b() default 0;

    short s() default 0;

    int i() default 0;

    long l() default 0L;

    float f() default 0.0F;

    double d() default 0.0;

    boolean flag() default false;

    char c() default '0';

    Class clazz() default String.class;

    Season season() default Season.SPRING;

    MyAnnocation myAnnotation();

    String[] names();
}
