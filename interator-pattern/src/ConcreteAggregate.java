import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaosen
 * @date 2019/6/13 11:51
 * @description
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<T>();
    @Override
    public void add(T object) {
        this.list.add(object);
    }

    @Override
    public void remove(T object) {
        this.list.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator<T>(this.list);
    }
}
