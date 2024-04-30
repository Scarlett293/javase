package com.powernode.javase.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectOutputStreamTest03
 * @Date: 2024/4/21 11:23 18
 */
public class ObjectOutputStreamTest03 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student"));

        Student stu = new Student("zhangsan", 20);

        oos.writeObject(stu);



        oos.flush();

        oos.close();
    }
}
