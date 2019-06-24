package condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaosen
 * @date 2019/6/24 8:20
 * @description
 */
public class Myservice {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void await() {
        lock.lock();
        try {
            System.out.println(" await时间为" + System.currentTimeMillis());
            condition.await();
            System.out.println("这是condition.await()方法之后的语句，condition.signal()方法之后我才被执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() throws InterruptedException {
        lock.lock();
        try {
            System.out.println("signal时间为" + System.currentTimeMillis());
            condition.signal();
            Thread.sleep(3000);
            System.out.println("这是condition.signal()方法之后的语句");
        } finally {
            lock.unlock();
        }
    }

}
