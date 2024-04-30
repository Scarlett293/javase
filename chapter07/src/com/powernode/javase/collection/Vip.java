package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: Vip
 * @Date: 2024/4/17 16:53 43
 */
public class Vip<NameType, AgeType> {
    private NameType name;
    private AgeType age;

    public Vip(NameType name, AgeType age) {
        this.name = name;
        this.age = age;
    }

    public NameType getName() {
        return name;
    }

    public void setName(NameType name) {
        this.name = name;
    }

    public AgeType getAge() {
        return age;
    }

    public void setAge(AgeType age) {
        this.age = age;
    }


    public static void main(String[] args) {
        // 创建VIP对象
        Vip<String, Integer> v1 = new Vip<>("张三", 20);
        Vip<String, String> v2 = new Vip<>("张三", "20");

    }

}
