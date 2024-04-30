package com.bjpowernode.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * ClassName: HttpUtils
 * Decription: http相关工具类
 * Package: com.bjpowernode.util
 * Date: 2024/4/28 14:34
 * Author: Scalett
 * Version: 1.0
 */
public class HttpUtils {
    /**
     * 获取HttpURLConnection链接对象
     *
     * @param url 文件的地址
     * @return
     */
    public static HttpURLConnection getHttpURLConnection(String url) throws IOException {
        URL httpUrl = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpUrl.openConnection();
        // 向文件所在的服务器发送标识信息
        httpURLConnection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, Like Gecko) Chrome/14.0.835.163 Safari/535.1");
        return httpURLConnection;
    }

    public static String getHttpFileName(String url) {
        int index = url.lastIndexOf("/");
        return url.substring(index + 1);
    }
}
