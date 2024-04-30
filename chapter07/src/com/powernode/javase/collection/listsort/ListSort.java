package com.powernode.javase.collection.listsort;


import java.util.ArrayList;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.listsort
 * @ClassName: ListSort
 * @Date: 2024/4/18 11:33 44
 */
public class ListSort {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("abc", 20);
        Person p2 = new Person("bbc", 18);
        Person p3 = new Person("abb", 19);
        Person p4 = new Person("cbs", 5);
        Person p5 = new Person("cbs", 6);


        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        persons.sort(new PersonComparable());

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

    }
}
