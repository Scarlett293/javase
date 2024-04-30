package com.powernode.javase.oop34;

/**
 * time :2024/3/25 23:04 37
 * ClassName :AddressTest
 * Package :com.powernode.javase.oop34
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class AddressTest {
    public static void main(String[] args) {
        Address addr = new Address("北京", "朝阳", "1111111");
        String s = addr.toString();
        System.out.println(s); // com.powernode.javase.oop34.Address@2f4d3709
    }
}
