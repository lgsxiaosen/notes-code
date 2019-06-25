package timefuture;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author xiaosen
 * @date 2019/6/25 8:27
 * @description
 */
public class MyTask5 {
    public static void main(String[] args){
        System.out.println("现在执行时间："+ LocalDateTime.now());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND)-20);
        Date date = calendar.getTime();
        System.out.println("计划执行时间："+ date);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("开始："+LocalDateTime.now());
                System.out.println("  结束："+LocalDateTime.now());
            }
        }, date, 2000);
    }
}
