package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/26 8:43
 * @description
 */
public class DaemonThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        super.run();
        try {
            while (true){
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
