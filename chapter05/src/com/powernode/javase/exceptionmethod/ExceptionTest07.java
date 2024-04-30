package com.powernode.javase.exceptionmethod;

import com.powernode.javase.exception.IllegalAgeException;
import com.powernode.javase.exception.IllegalNameException;

import java.util.Random;
import java.util.Scanner;


public class ExceptionTest07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用本系统，先进行用户的注册：");
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();


        UserService userService = new UserService();

        try {
            userService.register(name, age);
        } catch (IllegalNameException e) {
            // 这个方法可以获取当时创建异常对象时给异常构造方法传递的String message参数的值
//            String message = e.getMessage();
//            System.out.println(message);

            // 真正的开发中，这里不要空白
            // 这个方法可以帮助我们程序员去调试程序。
            // 打印异常堆栈信息
            e.printStackTrace();
        } catch (IllegalAgeException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        Random r = new Random();
        int[] arr = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            arr[i] = r.nextInt(10000000);
        }
        System.out.println("hello world");

    }
}


class UserService {
    public void register(String name, int age) throws IllegalNameException, IllegalAgeException {
        System.out.println("正在注册，请稍后...");
        UserDao userDao = new UserDao();
        userDao.save(name, age);
        System.out.println("注册成功，欢迎[" + name + "]");

    }
}


class UserDao {
    public void save(String name, int age) throws IllegalAgeException, IllegalNameException {
        System.out.println("用户[" + name + "]的信息正在保存...");
        if (name.length() < 6 || name.length() > 12) {
            throw new IllegalNameException("无效名字异常，名字长度应该在[6-12位]");
        }
        if (age < 18) {
            throw new IllegalAgeException("无效年龄异常，年龄需要大于18岁");
        }
        System.out.println("用户[" + name + "]的信息保存成功！");
    }
}
