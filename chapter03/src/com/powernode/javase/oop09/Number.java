package com.powernode.javase.oop09;

/**
 * time :2024/3/9 20:57 04
 * ClassName :Caculator
 * Package :com.powernode.javase.oop09
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Number {
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void add() {
        System.out.println(this.getN1() + "+" + this.getN2() + "=" + (this.getN1() + this.getN2()));

    }

    public void sub() {
        System.out.println(this.getN1() + "-" + this.getN2() + "=" + (this.getN1() - this.getN2()));
    }

    public void mul() {
        System.out.println(this.getN1() + "*" + this.getN2() + "=" + (this.getN1() * this.getN2()));
    }

    public void div() {
        System.out.println(this.getN1() + "/" + this.getN2() + "=" + (this.getN1() / this.getN2()));
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
