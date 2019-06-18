/**
 * @author xiaosen
 * @date 2019/6/18 14:45
 * @description
 */
public class ConcreteSubject extends Subject {
    public void doSomething(){
        System.out.println("具体的被观察者的业务");
        super.notifyObserver();
    }
}
