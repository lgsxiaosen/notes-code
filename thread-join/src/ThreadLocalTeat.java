
/**
 * @author xiaosen
 * @date 2019/6/18 8:13
 * @description
 */
public class ThreadLocalTeat {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException{
        int count = 30;
        String name = "Thread-";
        for (int i=0; i<count; i++){
            Thread thread = new Thread(() -> {
                threadLocal.set(Thread.currentThread().getName());
                System.out.println(threadLocal.get());
            }, name+i);
            thread.start();
        }
        Thread.sleep(20000);
    }
}
