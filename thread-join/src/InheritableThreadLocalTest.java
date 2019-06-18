/**
 * @author xiaosen
 * @date 2019/6/18 8:27
 * @description
 */
public class InheritableThreadLocalTest extends InheritableThreadLocal {
    @Override
    protected Object childValue(Object parentValue) {
        return super.childValue(parentValue);
    }

    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
}
