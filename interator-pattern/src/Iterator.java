/**
 * @author xiaosen
 * @date 2019/6/13 11:40
 * @description
 */
public interface Iterator<T> {
    T next();

    boolean hasNext();

    boolean remove();
}
