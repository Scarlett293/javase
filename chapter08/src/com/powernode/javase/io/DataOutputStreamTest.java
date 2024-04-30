package com.powernode.javase.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: DataOutputStreamTest
 * @Date: 2024/4/21 10:47 57
 */
public class DataOutputStreamTest  {
    public static void main(String[] args) throws Exception {

        // 节点流
        // OutputStream os = new FileOutputStream("data");
        // 包装流
        // DataOutputStream dos = new DataOutputStream(os);
         DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));

         byte b = 127;
         short s = 32767;
         int i = 2147483647;
         long l = 1111111L;
         float f = 3.0F;
         double d = 3.14;
         boolean flag = false;
         char c = '国';
         String str = "动力节点";

         dos.writeByte(b);
         dos.writeShort(s);
         dos.writeInt(i);
         dos.writeLong(l);
         dos.writeFloat(f);
         dos.writeDouble(d);
         dos.writeBoolean(flag);
         dos.writeChar(c);
         dos.writeUTF(str);

         dos.flush();
         dos.close();
    }
}
