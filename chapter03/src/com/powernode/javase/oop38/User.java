package com.powernode.javase.oop38;

/**
 * time :2024/3/27 21:06 52
 * ClassName :User
 * Package :com.powernode.javase.oop38
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class User implements Cloneable{
    private String name;
    private Address addr;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 重写方法，让其达到深克隆的效果
        // User要克隆，User对象关联的Address对象也需要克隆一份。
        Address addr = (Address)this.getAddr().clone();
        User copyUser = (User)super.clone();
        copyUser.setAddr(addr);
        return copyUser;
    }
}
