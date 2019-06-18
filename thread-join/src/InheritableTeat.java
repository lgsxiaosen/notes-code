/**
 * @author xiaosen
 * @date 2019/6/18 8:28
 * @description
 */
public class InheritableTeat {
    static public class Inner{
        public static InheritableThreadLocalTest threadLocalTest = new InheritableThreadLocalTest();
    }


    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i<3; i++){
            System.out.println("在main线程中获取值："+ Inner.threadLocalTest.get());
        }

                for (int i=0; i<3; i++){
                    new Thread(() -> {
                        System.out.println("在"+Thread.currentThread().getName()+"中获取值："+ Inner.threadLocalTest.get());
            }, "Thread-"+i).start();
        }
        Thread.sleep(1000);

    }

}
