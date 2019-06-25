package timefuture;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author xiaosen
 * @date 2019/6/25 7:59
 * @description
 */
public class MyTask1 {

    public static void main(String[] args){
        System.out.println("当前时间为："+ LocalDateTime.now());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 5);
        Date date = calendar.getTime();
        System.out.println("计划时间为："+ date);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务执行了，时间为："+ LocalDateTime.now());
            }
        }, date, 4000);
    }
}
