/**
 * @author xiaosen
 * @date 2019/6/13 11:49
 * @description
 */
public interface Aggregate<T> {
    void add(T object);

    void remove(T object);

    Iterator iterator();

}
