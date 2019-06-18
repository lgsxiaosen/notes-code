import java.util.Observable;

/**
 * @author xiaosen
 * @date 2019/6/18 15:00
 * @description
 */
public class SubjectApi extends Observable {
    public void doSomething(){
        System.out.println("具体的被观察者的业务---继承java.util.Observable");
        super.setChanged();
        super.notifyObservers();
    }
}
