package com.powernode.javase.io.clone;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.clone
 * @ClassName: Address
 * @Date: 2024/4/22 09:43 49
 */
public class Address implements Serializable {

    @Serial
    public static final long serialVersionUID = 8939577034530859467L;

    private String city;
    private String street;

    public Address() {
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
