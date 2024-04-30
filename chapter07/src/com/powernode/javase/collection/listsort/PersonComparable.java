package com.powernode.javase.collection.listsort;

import java.util.Comparator;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.listsort
 * @ClassName: PersonComparable
 * @Date: 2024/4/18 11:35 45
 */
public class PersonComparable implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
