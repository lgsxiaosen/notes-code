package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/26 7:41
 * @description
 */
public class SleepFunc {

    public static void sleep(){
        System.out.println("begin");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end");
    }

    public static void main(String[] args){
        System.out.println("begin time = " + System.currentTimeMillis());
        sleep();
        System.out.println("end time = " + System.currentTimeMillis());
    }


}
