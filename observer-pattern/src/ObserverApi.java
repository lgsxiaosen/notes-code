import java.util.Observable;
import java.util.Observer;

/**
 * @author xiaosen
 * @date 2019/6/18 15:01
 * @description
 */
public class ObserverApi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("接收到消息，进行处理----使用java.util.Observer接口");
    }

}
