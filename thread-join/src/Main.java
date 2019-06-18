public class Main {

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName()+"正在执行");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }, "线程1");
        thread.start();
        thread.join();
        System.out.println("等待"+thread.getName()+"执行完");
    }
}
