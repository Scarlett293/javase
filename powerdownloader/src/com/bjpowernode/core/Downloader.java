package com.bjpowernode.core;

import com.bjpowernode.constant.Constant;
import com.bjpowernode.util.HttpUtils;

import java.io.*;
import java.net.HttpURLConnection;

/**
 * ClassName: Downloader
 * Decription:
 * Package: com.bjpowernode.core
 * Date: 2024/4/28 14:46
 * Author: Scalett
 * Version: 1.0
 */

/**
 * 下载器
 */
public class Downloader {
    public void download(String url) {
        // 获取文件名
        String httpFileName = HttpUtils.getHttpFileName(url);
        // 文件下载路径
        httpFileName = Constant.PATH + httpFileName;
        // 获取连接对象
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = HttpUtils.getHttpURLConnection(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
                InputStream input = httpURLConnection.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(input);
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(httpFileName));
        ) {

            int len = -1;
            while((len = bis.read()) != -1) {
                bos.write(len);
            }

        } catch (FileNotFoundException e) {
            System.out.println("下载的文件不存在");
        } catch (Exception e) {
            System.out.println("下载失败");
        } finally {
            // 关闭链接对象
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}
