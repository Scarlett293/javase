package com.powernode.javase.annotation.meta1;/**
 * @author :29369
 * @Package: com.powernode.javase.annotation.meta1
 * @ClassName: Tesr
 * @Date: 2024/4/25 14:27 12
 */
@MyAnnotation // 这个注解会被保留到字节码中，并且在运行时可以被反射
public class Test {
    public static void main(String[] args) {
        Class<Test> testClass = Test.class;

        MyAnnotation annotation = testClass.getAnnotation(MyAnnotation.class);

        System.out.println(annotation);
    }
}
