package src.com.powernode.javase.integertest;

/**
 * time :2024/4/15 10:26 43
 * ClassName :MyInteger
 * Package :src.com.powernode.javase.integertest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override

    public String toString() {
        return String.valueOf(value);
    }

}
