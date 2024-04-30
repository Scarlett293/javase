package com.powernode.javase.io;

/**
 * @author :29369
 * @Package: com.powernode.javase.io
 * @ClassName: TryWithResources
 * @Date: 2024/4/20 16:23 06
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Java7的新特性：try-with-resources（资源自动关闭）0
 * 凡是实现了AutoCloseable接口的流都可以使用try-with-resources。都会自动关闭
 * try-with-resources语法格式：
 * try(){
 * 声明流;
 * 声明流;
 * 声明流;
 * 声明流;
 * }{
 * <p>
 * }catch(Exception e) {
 * <p>
 * }
 */
public class TryWithResources {
    public static void main(String[] args) {
        // 测试try-with-resources语法
/*        FileInputStream in2 = null;
        try(FileInputStream in = new FileInputStream("D:\\JavaLearn\\code\\file1.txt")) {
            in2 = in;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            in2.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try (FileInputStream in = new FileInputStream("D:\\JavaLearn\\code\\file1.txt");
             FileOutputStream out = new FileOutputStream("D:\\JavaLearn\\code\\file4.txt")) {
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
