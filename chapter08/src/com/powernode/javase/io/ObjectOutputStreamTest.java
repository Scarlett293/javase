package com.powernode.javase.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectOutputStreamTest
 * @Date: 2024/4/21 11:08 38
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object"));

        Date nowTime = new Date();

        oos.writeObject(nowTime);






        oos.flush();

        oos.close();
    }
}
