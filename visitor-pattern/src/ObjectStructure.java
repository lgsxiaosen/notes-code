import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xiaosen
 * @date 2019/6/21 18:45
 * @description
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }


}
