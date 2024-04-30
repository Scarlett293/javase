package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectInputStreamTest04
 * @Date: 2024/4/21 11:55 23
 */
public class ObjectInputStreamTest04 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student"));
        Object o = ois.readObject();
        System.out.println(o);


        ois.close();
    }
}
