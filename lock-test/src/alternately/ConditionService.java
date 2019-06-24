package alternately;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaosen
 * @date 2019/6/24 8:40
 * @description
 */
public class ConditionService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set(){
        try {
            lock.lock();
            while (hasValue == true){
                condition.await();
            }
            System.out.println("打印☆");
            hasValue = true;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        try {
            lock.lock();
            while (hasValue == false){
                condition.await();
            }
            System.out.println("打印★");
            hasValue = false;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
