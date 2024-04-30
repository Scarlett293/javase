package com.powernode.javase.newfun;

/**
 * ClassName: NewFun02
 * Decription:
 * Package: com.powernode.javase.newfun
 * Date: 2024/4/28 10:25
 * Author: Scalett
 * Version: 1.0
 */
public class NewFun02 {
    public static void main(String[] args) {
/*        int i = 100;
        double d = 3.14;
        boolean flag = false;*/
        // Java10的新特性：局部变量类型判断
        var i = 100;
        var d = 3.14;
        var flag = false;
        System.out.println(i);
        System.out.println(d);
        System.out.println(flag);
    }
}
