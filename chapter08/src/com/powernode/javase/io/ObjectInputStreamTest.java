package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectInputStream
 * @Date: 2024/4/21 11:15 06
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("object"));
    }
}
