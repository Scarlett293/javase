package com.powernode.javase.io.clone;

import java.io.*;

/**
 * @author :29369
 * @Package: com.powernode.javase.io.clone
 * @ClassName: DeepCloneTest
 * @Date: 2024/4/22 09:45 36
 */
public class DeepCloneTest {
    public static void main(String[] args) throws Exception {
        Address addr = new Address("北京", "朝阳");
        User user = new User("zhangsan", 20, addr);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(user);


        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        User user1 = (User) ois.readObject();

        user1.getAddr().setCity("南京");

        System.out.println(user);
        System.out.println(user1);


    }
}
