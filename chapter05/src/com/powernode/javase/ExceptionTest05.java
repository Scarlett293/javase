package com.powernode.javase;

/**
 * time :2024/4/13 17:51 37
 * ClassName :ExceptionTest05
 * Package :com.powernode.javase
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 异常我们在哪里使用呢？
 *      以前的写法：
 *          if(xxx){
 *              System.out.println();
 *              return
 *          }
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        User user = new User();
        try {
            user.setAge(-100);
        } catch (Exception e) {
            System.out.println(".........");
        }
    }
}

class User {
    private int age;
    public User() {

    }
    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 0 || age > 100) {
//            System.out.println("对不起，年龄不合法");
//            return;

            // 手动抛出异常
            throw new Exception("年龄不合法");
        }
        this.age = age;
    }
}
