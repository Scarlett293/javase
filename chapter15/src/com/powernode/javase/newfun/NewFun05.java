package com.powernode.javase.newfun;

/**
 * ClassName: NewFun05
 * Decription:
 * Package: com.powernode.javase.newfun
 * Date: 2024/4/28 11:32
 * Author: Scalett
 * Version: 1.0
 */
public class NewFun05 {
    public static void main(String[] args) {
        // 需求 输出一段HTML代码到控制台，并且要求展示的格式如下
        String htmlCode =
                "<html>\n" +
                "   <head>\n" +
                "       <title>first page</title>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "       <h1>my first html page!</h1>\n" +
                "   </body>\n" +
                "</html>\n";
        System.out.println(htmlCode);
        // 使用文本块
        String htmlCode2 = """
                <html>
                    <head>
                        <title>first page</title>
                    </head>
                    <body>
                        <h1>my first html page!</h1>
                    </body>
                </html>
                """;
    }
}
