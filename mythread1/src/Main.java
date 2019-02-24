import main.java.com.xiaosen.myrunnable.MyRunnable;
import main.java.com.xiaosen.mythread.MyThread;

public class Main {

    public static void main(String[] args) {
        // 继承Thread
        MyThread myThread = new MyThread();
        myThread.start();
        // lambda表达式的使用
        new Thread(() -> System.out.println("this is lambda thread")).start();

        // 实现Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("Hello World!");

    }
}
