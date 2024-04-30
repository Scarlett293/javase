package com.powernode.javase.trytest;

import com.powernode.javase.exception.IllegalAgeException;
import com.powernode.javase.exception.IllegalNameException;

import java.util.Scanner;


/**
 * 异常处理的第二种方式：捕捉
 * 语法格式：
 *      try {
 *          // 需要尝试执行的程序，这里的程序可能出现异常
 *      }catch(异常类型1 变量名) {
 *          // 当捕捉到的异常是“异常类型1”时，走这个分支，进行异常的处理
 *      }catch(异常类型2 变量名) {
 *          // 当捕捉到的异常是“异常类型2”时，走这个分支，进行异常的处理
 *      }catch(异常类型3 变量名) {
 *          // 当捕捉到的异常是“异常类型2”时，走这个分支，进行异常的处理
 *      }...
 *
 *      // 后续java代码可以执行
 *      另外注意：
 *          catch语句块可以看作是分支，try catch语句中，最多只有一个catch分支执行
 *          catch可以写多个，但是必须遵循自上而下，从小到大。
 */
public class ExceptionTest04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用本系统，先进行用户的注册：");
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();


        UserService userService = new UserService();
        /* try {
            // 可能出现异常的代码
            userService.register(name, age);
            // 如果伊桑代码出现异常，这里不会执行
            System.out.println("如果出现异常，这里的代码不会执行");
        } catch (IllegalNameException e) {
            System.out.println("对不起，用户名不合法");
        } catch (IllegalAgeException e) {
            System.out.println("对不起，年龄不合法");
        } */
        /* try {
            // 可能出现异常的代码
            userService.register(name, age);
            // 如果伊桑代码出现异常，这里不会执行
            System.out.println("如果出现异常，这里的代码不会执行");
        } catch (Exception e) {
            System.out.println("异常发生了");
        } */


        // java7的新特性
        try {
            userService.register(name, age);
        } catch (IllegalAgeException | IllegalNameException e) {
            System.out.println("对不起，参数不合法");
        }


        System.out.println("main over");
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
            throw new IllegalNameException();
        }
        if (age < 18) {
            throw new IllegalAgeException();
        }
        System.out.println("用户[" + name + "]的信息保存成功！");
    }
}
