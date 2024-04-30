package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: ByteArrayOutputStreamTest02
 * @Date: 2024/4/21 23:37 02
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 了解了装饰器设计模式之后，我们就知道了，包装流和节点流是可以随意组合的。
 * ObjectOutputStream（包装流）和ByteArrayOutputStream（节点流）进行组合。
 */
public class ByteArrayOutputStreamTest02 {
    public static void main(String[] args) throws Exception {
        // 节点流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // 包装流
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // 开始写
        oos.writeInt(100);
        oos.writeBoolean(false);
        oos.writeDouble(3.14);
        oos.writeUTF("动力节点");
        oos.writeObject(new Date());

        // 使用了包装流就需要手动刷新一下
        oos.flush();

        // 获取内存中的大byte数组
        byte[] byteArray = baos.toByteArray();
/*        for (byte b : byteArray) {
            System.out.println(b);
        }*/

        // 使用ByteArrayIntputStream将上面这个byte数组恢复
        // 读的过程，读内存中的大byte数组。
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = new ObjectInputStream(bais);

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());
    }
}
