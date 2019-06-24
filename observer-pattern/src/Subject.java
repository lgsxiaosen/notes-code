import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaosen
 * @date 2019/6/18 14:42
 * @description
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public void addObserver(Observer observer){
        this.list.add(observer);
    }

    public void removeObserver(Observer observer){
        this.list.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer: this.list){
            observer.update();
        }
    }

}
