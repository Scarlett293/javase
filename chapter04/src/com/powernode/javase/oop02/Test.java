package com.powernode.javase.oop02;

/**
 * time :2024/4/4 19:52 44
 * ClassName :Dog
 * Package :com.powernode.javase.oop02
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test extends Animal {

    public static void main(String[] args) {




        Bird b = new Bird();
        Cat c = new Cat();



        Animal[] animals = {b, new Cat(), new Bird()};

        // 请遍历Anila数组，然后取出的Cat()让它抓老鼠，取出Bird让它飞

        for (Animal animal : animals) {
            if(animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.catchMouse();
            } else if(animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }

        /*
        Animal[] animals = {new Cat(), new Bird()};

         */


        /*
        A a = new A();
        B b = new B();
        Cat c = new Cat();
        Object[] objs = {a, b, c};

         */
    }
}

class A {

}

class B {

}
