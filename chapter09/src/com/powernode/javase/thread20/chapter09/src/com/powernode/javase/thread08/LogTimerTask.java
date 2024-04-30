package com.powernode.javase.thread20.chapter09.src.com.powernode.javase.thread08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author :29369
 * @Package: com.powernode.javase.thread08
 * @ClassName: LogTimerTask
 * @Date: 2024/4/22 15:05 01
 */
public class LogTimerTask extends TimerTask {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    int count = 0;

    @Override
    public void run() {
        //
        Date now = new Date();
        String strTime = sdf.format(now);
        System.out.println(strTime + ":" + count++);


    }
}
