package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/24 10:36
 * @description
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("this is MyThread");
    }


}
