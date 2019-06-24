package condition;

/**
 * @author xiaosen
 * @date 2019/6/24 8:21
 * @description
 */
public class MyserviceTest {

    public static void main(String[] args) throws InterruptedException{
        Myservice myservice = new Myservice();
        new Thread(() -> myservice.await()).start();
        Thread.sleep(3000);
        myservice.signal();
    }
}
