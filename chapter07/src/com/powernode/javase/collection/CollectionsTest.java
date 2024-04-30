package com.powernode.javase.collection;

import java.util.*;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.treemap
 * @ClassName: CollectionsTestr
 * @Date: 2024/4/19 22:53 43
 */
public class CollectionsTest {
    public static void main(String[] args) {
        // sort方法，专门针对List集合提供一个sort方法
        List<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(8);
        list.add(7);
        Collections.sort(list);
        System.out.println(list);

        // 如果List集合中的元素是自定义类型的，可以排序吗？
        // 当然可以，前提是需要实现Comparable接口，提供比较规则

        Person p1 = new Person(20);
        Person p2 = new Person(25);
        Person p3 = new Person(1);
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        // Collections.sort(personList);
        // System.out.println(personList);

        // sort的重载方法，可以单独提供一个比较器方式来达到排序
        Collections.sort(personList, new Comparator<Person> () {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });


        System.out.println(personList);


        // 打乱顺序
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
        // Collections.shuffle(list2);
        // System.out.println(list2);

        // 反转list集合中的元素
        Collections.reverse(list2);
        System.out.println(list2);

        // 替换所有元素
        Collections.fill(list2, null);
        System.out.println(list2);


    }
}

// class Person implements Comparable<Person>{
class Person{
    private int age;
    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

/*    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }*/
}
