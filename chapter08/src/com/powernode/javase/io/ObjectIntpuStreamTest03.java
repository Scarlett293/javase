package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectIntpuStreamTest03
 * @Date: 2024/4/21 11:26 17
 */
public class ObjectIntpuStreamTest03 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student"));


        System.out.println(ois.readObject());


        ois.close();

    }
}
