package timefuture;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author xiaosen
 * @date 2019/6/25 7:40
 * @description
 */
public class Mytask {

    public static void main(String[] args){
        System.out.println("当前时间为："+LocalDateTime.now());
        Timer timer = new Timer();
//        Timer timer = new Timer(true);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date date = calendar.getTime();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务执行了，时间为："+ LocalDateTime.now());
            }
        }, date);

    }

}
