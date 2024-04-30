package com.powernode.javase.annotation;

/**
 * @author :29369
 * @Package: com.powernode.javase.annotation
 * @ClassName: AnnotationTest01
 * @Date: 2024/4/24 22:47 02
 */
public class AnnotationTest01 {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        System.out.println(myClass1.num);
        myClass1.doSome();

    }
}

@Deprecated
class MyClass1 {
    @Deprecated(since = "9", forRemoval = true)
    public static int num = 100;

    @Deprecated
    public void doSome() {
        
    }
}
