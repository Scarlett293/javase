package com.powernode.javase.collection.listsort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.listsort
 * @ClassName: ListSort2
 * @Date: 2024/4/18 11:39 22
 */
public class ListSort2 {
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

        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getAge() - t1.getAge();
            }
        });

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
