package com.powernode.javase.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ObjectOutputStreamTest02
 * @Date: 2024/4/21 11:17 15
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        Date date4 = new Date();
        Date date5 = new Date();
        Date date6 = new Date();

        List<Date> list = new ArrayList<>();

        list.add(date1);
        list.add(date2);
        list.add(date3);
        list.add(date4);
        list.add(date5);
        list.add(date6);

        // 序列化
        ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("dates"));
        dos.writeObject(list);

        dos.flush();
        dos.close();
    }
}
