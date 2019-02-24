package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/24 16:04
 * @description
 */
public class ShareThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        System.out.println("线程不安全" + this.currentThread().getName() + ":count=" + count);
        synchronized (ShareThread.class){
            count--;
            System.out.println("线程安全" + this.currentThread().getName() + ":count=" + count);
        }

    }

    public static void main(String[] args){
        ShareThread shareThread = new ShareThread();
        Thread a = new Thread(shareThread, "A");
        Thread b = new Thread(shareThread, "B");
        Thread c = new Thread(shareThread, "C");
        Thread d = new Thread(shareThread, "D");
        Thread e = new Thread(shareThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }


}
