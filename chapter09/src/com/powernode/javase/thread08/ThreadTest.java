package com.powernode.javase.thread08;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.Date;
import java.util.TimerTask;
/**
 * @author :29369
 * @Package: com.powernode.javase.thread08
 * @ClassName: ThreadTest
 * @Date: 2024/4/22 14:58 19
 */

/**
 *
 */
public class ThreadTest {
    public static void main(String[] args) throws Exception {
        // 创建定时器对象（本质上就是一个线程）
        // 如果这个定时器执行的是一个后台任务，是一个守护任务，建议将其定义为守护线程
        Timer timer = new Timer(true);

       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2024-04-22 15:10:00");
        //
        //timer.schedule(new LogTimerTask(), firstTime, 1000);

        timer.schedule(new TimerTask() {
            int count = 0;
            @Override
            public void run() {

                Date now = new Date();
                String strTime = sdf.format(now);
                System.out.println(strTime + ":" + count++);
            }
        }, firstTime, 1000 * 5);

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
        }
    }
}
