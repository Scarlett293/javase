package com.powernode.javase.collection.set;


import java.util.Objects;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.set
 * @ClassName: Vip
 * @Date: 2024/4/19 21:22 07
 */
// public class Vip implements Comparable<Vip>{
public class Vip {
    private String idCard;
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vip vip = (Vip) o;
        return Objects.equals(idCard, vip.idCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCard, name, age);
    }

    @Override
    public String toString() {
        return "Vip{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Vip(String idCard, String name, int age) {
        this.idCard = idCard;
        this.name = name;
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    @Override
    public int compareTo(Vip o) {
        return this.age - o.age;
    }*/
}
