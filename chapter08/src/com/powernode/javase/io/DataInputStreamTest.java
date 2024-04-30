package com.powernode.javase.io;


import java.io.FileInputStream;
import java.io.DataInputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: DataInputStream
 * @Date: 2024/4/21 10:56 32
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
/*        DataInputStream dis = new DataInputStream(new FileInputStream("data"));


        // 开始读
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean flag = dis.readBoolean();
        char c = dis.readChar();
        String str = dis.readUTF();


        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(flag);
        System.out.println(c);
        System.out.println(str);*/







        // dis.close();

        FileInputStream fis = new FileInputStream("data");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        fis.close();
    }
}
