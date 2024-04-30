package com.powernode.javase.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectOutputStreamTest04
 * @Date: 2024/4/21 11:54 11
 */
public class ObjectOutputStreamTest04 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student"));

        Student stu = new Student("张三", 12);

        oos.writeObject(stu);

        oos.flush();

        oos.close();
    }
}
