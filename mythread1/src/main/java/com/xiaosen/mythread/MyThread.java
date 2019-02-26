package main.java.com.xiaosen.mythread;

/**
 * @author xiaosen
 * @date 2019/2/24 10:36
 * @description
 */
public class MyThread extends Thread{
    public MyThread(){
        super();
    }
    public MyThread(String name){
        super();
        this.setName(name);
        System.out.println("构造器中线程名字:" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("this is MyThread");
        System.out.println("run方法中线程名字:" + Thread.currentThread().getName());
    }


    public static void main(String[] args){

        // 继承Thread
        MyThread myThread = new MyThread("myThread-name");
        myThread.start();
    }


}
