import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaosen
 * @date 2019/6/19 8:07
 * @description
 */
public class LockTest {
    private Lock lock = new ReentrantLock();

    public void test(){
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
            }
        }finally {
            lock.unlock();
        }
    }
}
