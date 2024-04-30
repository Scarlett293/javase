package src.com.powernode.javase.stringtest;

/**
 * time :2024/4/13 22:16 55
 * ClassName :StringMethodTest
 * Package :src.com.powernode.javase.stringtest
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试用例
 */
public class StringMethodTest {
    @Test
    public void testMatches() {
        // 邮箱地址的正则表达式
        String emailRegExp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String email = "2936900025@qq.com";
        System.out.println(email.matches(emailRegExp));
    }

    @Test
    public void testSplit() {
        // 根据正则表达式进行字符串的拆分
        // 拆分后返回一个字符串数组
        String[] strs = "动3力3节2点4。".split("\\d");
        System.out.println(strs.length);
        for (String s : strs) {
            System.out.println(s);
        }

        String[] ymd = "1970-10-11".split("-");
        for (String s : ymd) {
            System.out.println(s);
        }

        String data = "name=zhangsan&password=123&email=zhangsan@123.com&gender=男";
        String[] params = data.split("&");

        for (String param : params) {
//            System.out.println(s);
            String[] nameAndValue = param.split("=");
            for (String s : nameAndValue) {
                System.out.println(s);
            }
        }

    }
    @Test
    public void testReplace() {

        // 这个也是替换所有，只不过没有使用正则表达式
        String s1 = "oraclejavac++mysqlphppythonjavamysql";

        String s2 = s1.replace("java", "golang");
        System.out.println(s2);

        // 替换所有，使用正则表达式
        String str2 = "a1b2c3d54e43f".replaceAll("\\d", "");
        System.out.println(str2);
    }
    @Test
    public void testValueOf() {
        // 将非字符串类型的数据转换成字符串类型
        String s1 = String.valueOf(1000);
        System.out.println(s1);

        System.out.println((s1 instanceof String));

        int a = 1000;
        String s2 = a + "";
        System.out.println(s2);

        //将Object转换成字符串
        Object obj = new Object();
        String s3 = String.valueOf(obj);
        System.out.println(s3);

        User user = new User("jack", 20);
        String s4 = String.valueOf(user);
        System.out.println(s4);


        User user1 = null;
        String s5 = String.valueOf(user1);
        System.out.println(s5);
    }
    @Test
    public void testJoin() {
        //  将多个字符串以某个符号进行拼接， 生成一个全新的字符串
        String s1 = String.join(",", "java", "c++", "oracle", "mysql");
        System.out.println(s1);

        String year = "1970";
        String month = "10";
        String day = "11";
        System.out.println(String.join("/", year, month, day));


        // 创建一个集合对象
        List list = new ArrayList();
        list.add("abc");
        list.add("def");
        list.add("xyz");

        System.out.println(String.join("-", list));

    }

    @Test
    public void testIntern() {
         // 将字符串放入字符串常量池
        byte[] bytes = {97, 98, 99, 100};
        String s = new String(bytes);
    }

    @Test
    public void testToString()
    {
        String s1 = new String("abc");
        System.out.println(s1); //  “abc”
    }

    @Test
    public void testTrim() {
        // 去除字符串的前后空白
        // 注意：trim()方法只能去除什么空白？ ASCII码的空白以及制表符tab。（无法去除全角空白）
        String s1 = "                        abc              def               ";
        String s2 = s1.trim();
        System.out.println("===>" + s2 + "<===");


        String s3 = "\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000abc\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000";
        System.out.println("===>" + s3 + "<===");
        String s4 = s3.strip();
        System.out.println("===>" + s4 + "<===");



        String s5 = s3.stripLeading();
        System.out.println("===>" + s5 + "<===");
        String s6 = s3.stripTrailing();
        System.out.println("===>" + s6 + "<===");

    }


    @Test
    public void testSubString() {
        System.out.println("http://www.baidu.com".substring(7)); // www.baidu.com
        System.out.println("http://www.baidu.com".substring("http://".length())); // www.baidu.com

        // substring(beginIndex, endIndex);
        // 包前不包后，包含beginIndex，不包含endIndex
        System.out.println("http://127.0.0.1:8080/login?name=admin&password=123".substring(17, 21));
    }

    @Test
    public void testConcat() {
        // 完成字符串的拼接操作
        String s1 = "test";
        String s2 = null;
//        String s3 = s1 + s2;
//        System.out.println(s3); // "testnull"

        // String s3 = s1.concat(s2); // 空指针异常
        // System.out.println(s3);
    }

    @Test
    public void testLowerUpperCase() {
        System.out.println("AbcDeF".toUpperCase());
        System.out.println("AbcDeF".toLowerCase());
    }

    @Test
    public void testToCharArray() {

        // 将字符串转换为字符数组
        char[] chars = "动力节点".toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
    }

    @Test
    public void testLastIndexOf() {
        // 左向搜索
        System.out.println("oraclec++javac#phppythongolangc++javamysqloracle".lastIndexOf("c++"));
        System.out.println("oraclec++javac#phppythongolangc++javamysqloracle".lastIndexOf("c++", 17));
    }

    @Test
    public void testIndexOf() {
        // 右向搜索
        System.out.println("oraclec++javac#phppythongolangjavamysqloracle".indexOf("java")); // 9
        System.out.println("oraclec++javac#phppythongolangjavamysqloracle".indexOf("java", 10)); // 30
      /*  boolean flag = false;
        if(flag) {
            System.out.println();
        }*/
    }

    @Test
    public void testCompareTo() {
        System.out.println("a".compareTo("b"));
        System.out.println("a".compareTo("c"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));
        System.out.println("A".compareTo("a"));
        System.out.println("A".compareToIgnoreCase("a"));
    }

    @Test
    public void testStartWithAndEndsWith() {
        System.out.println("http://www.baidu.com".startsWith("http://")); // true
        System.out.println("http://www.baidu.com".endsWith(".com")); // true
        System.out.println("http://www.baidu.com".startsWith("https://")); // true
        System.out.println("http://www.baidu.com".endsWith(".cn")); // true

    }

    @Test
    public void testContains() {
        System.out.println("HelloWorld.java".contains(".java"));
        System.out.println("HelloWorld.java".contains(".txt"));
    }

    @Test
    public void testEquals() {
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = "java";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

    }

    @Test
    public void testCharAt() {
        char c = "动力节点".charAt(3);
        System.out.println(c);
    }

    @Test
    public void testLength(){
        // 注意：数组是length属性，字符串是length()方法。
        System.out.println("动力节点".length());
    }

    @Test
    public void testIsEmpty() {
        String s = "";
        System.out.println(s.isEmpty());
        s = "hello";
        System.out.println(s.isEmpty());
        s = " ";
        System.out.println(s.isEmpty());
    }

}
