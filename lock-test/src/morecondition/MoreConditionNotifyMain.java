package morecondition;

/**
 * @author xiaosen
 * @date 2019/6/24 8:30
 * @description
 */
public class MoreConditionNotifyMain {

    public static void main(String[] args) throws InterruptedException{
        MoreConditionNotify conditionNotify = new MoreConditionNotify();
        new Thread(() -> conditionNotify.awaitA(), "A").start();
        new Thread(() -> conditionNotify.awaitB(), "B").start();
        Thread.sleep(3000);
        conditionNotify.signalAll_A();
    }
}
