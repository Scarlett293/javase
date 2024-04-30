package com.powernode.javase.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * ClassName: URLTest02
 * Decription:
 * Package: com.powernode.javase.net
 * Date: 2024/4/25 18:37
 * Author: Scalett
 * Version: 1.0
 */
public class URLTest02 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://tianqi.qq.com/");
        InputStream inputStream = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String s = null;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
