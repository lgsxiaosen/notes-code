package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/26 8:44
 * @description
 */
public class DaemonMain {

    public static void main(String[] args){
        try {
            DaemonThread daemonThread = new DaemonThread();
            daemonThread.setDaemon(true);
            daemonThread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
