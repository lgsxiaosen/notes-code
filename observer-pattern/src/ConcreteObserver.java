/**
 * @author xiaosen
 * @date 2019/6/18 14:46
 * @description
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到消息，进行处理");
    }
}
