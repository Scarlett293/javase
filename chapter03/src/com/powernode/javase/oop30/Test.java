package com.powernode.javase.oop30;

/**
 * time :2024/3/16 14:37 42
 * ClassName :Test
 * Package :com.powernode.javase.oop30
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("小狗", 10);
        dog.display();
        dog.eat();
        canItFly(dog);
        canItSpeak(dog);


        Animal xiaoYanZi = new XiaoYanZi("小燕子", 5);
        xiaoYanZi.display();
        xiaoYanZi.eat();
        // 向下转型
        // 并且java中有语法规定：类 转换成接口的时候，类和接口之间不需要有继承关系，编译器也不会报错
        canItFly(xiaoYanZi);
        canItSpeak(xiaoYanZi);


        Animal yingWu = new YingWu("鹦鹉", 3);
        yingWu.display();
        yingWu.eat();
        canItFly(yingWu);
        canItSpeak(yingWu);
    }
    public static void canItFly(Animal a) {
        if(a instanceof Flyable) {
            Flyable f = (Flyable) a;
            f.fly();
        }

    }
    public static void canItSpeak(Animal a) {
        if(a instanceof Speakable) {
            Speakable s = (Speakable) a;
            s.speak();
        }
    }
}
