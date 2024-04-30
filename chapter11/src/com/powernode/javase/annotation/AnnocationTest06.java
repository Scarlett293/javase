package com.powernode.javase.annotation;

/**
 * @author :29369
 * @Package: com.powernode.javase.annotation
 * @ClassName: AnnocationTest06
 * @Date: 2024/4/25 12:46 55
 */
public class AnnocationTest06 {
    @DataBaseInfo(
            driver = "com.mysql.cj.jdbc.Driver",
            url = "jdbc:mysql://localhost:3306/powernode",
            user = "root",
            password = "123456",
            myAnnotation = @MyAnnocation,
            names = {"zhangsan", "lisi", "wangwu"},
            flag = true,
            i = 100,
            clazz = Integer.class,
            season = Season.WINTER
    )
    public void connDB() {

    }
}
