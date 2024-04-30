package com.powernode.javase;

import com.powernode.javase.exception.IllegalAgeException;
import com.powernode.javase.exception.IllegalNameException;
import com.powernode.javase.exception.IllegalRealnameException;

import java.util.Scanner;

/**
 * time :2024/4/13 16:52 19
 * ClassName :ExceptionTest03
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest03 {

    // public static void main(String[] args) throws IllegalNameException, IllegalAgeException {
    public static void main(String[] args) throws Exception {
    // public static void main(String[] args) throws IllegalRealnameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用本系统，先进行用户的注册：");
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();


        // 注册
        UserService userService = new UserService();
        userService.register(name, age); // 这里的代码可能出现异常，如果一旦出现异常，后续代码则不再执行了

        System.out.println("main over");
    }
}


/**
 * 用户的业务类
 */
class UserService {
    public void register(String name, int age) throws IllegalNameException, IllegalAgeException {
        System.out.println("正在注册，请稍后...");
        UserDao userDao = new UserDao();
        userDao.save(name, age); // 这里有可能出现异常，出现了异常之后，后续程序则不再执行了
        System.out.println("注册成功，欢迎[" + name + "]");

    }
}


/**
 * 操作数据库的一个类
 */
class UserDao {
    /**
     * 用户要注册，肯定最后用户名和年龄这个用户相关的信息是需要保存的
     *
     * @param name 用户名
     * @param age  年龄
     */
    public void save(String name, int age) throws IllegalAgeException, IllegalNameException {
        System.out.println("用户[" + name + "]的信息正在保存...");
        if (name.length() < 6 || name.length() > 12) {
            throw new IllegalNameException();
            // 这里不能写任何代码，因为这里的diamagnetic永远都不会执行。
            // System.out.println("hello world!");
        }
        if (age < 18) {
            throw new IllegalAgeException();
        }
        System.out.println("用户[" + name + "]的信息保存成功！");
    }
}
