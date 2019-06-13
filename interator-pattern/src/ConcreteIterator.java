import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaosen
 * @date 2019/6/13 11:42
 * @description
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list;
    /**
     * 定义当前游标
     */
    public int cursor = 0;

    public ConcreteIterator(List<T> list){
        this.list = list;
    }

    @Override
    public T next() {
        T result = null;
        if (this.hasNext()){
            result = this.list.get(this.cursor++);
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return this.cursor != this.list.size();
    }

    @Override
    public boolean remove() {
        this.list.remove(this.cursor);
        return true;
    }
}
