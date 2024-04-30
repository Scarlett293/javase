package com.powernode.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectInputStreamTest02
 * @Date: 2024/4/21 11:19 23
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dates"));

        // 反序列化
        List<Date> dates = (List<Date>)ois.readObject();

        for (Date date : dates) {
            System.out.println(date);
        }

        // 反序列化
        ois.close();
    }
}
