package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/24 11:43
 * @description
 */
public class NotShareThread extends  Thread{
    private int count = 5;
    public NotShareThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("线程" + this.currentThread().getName() + ":count=" + count);
        }

    }

    public static void main(String[] args){
        NotShareThread notShareThread1 = new NotShareThread("A");
        NotShareThread notShareThread2 = new NotShareThread("B");
        NotShareThread notShareThread3 = new NotShareThread("C");
        notShareThread1.start();
        notShareThread2.start();
        notShareThread3.start();

    }
}
