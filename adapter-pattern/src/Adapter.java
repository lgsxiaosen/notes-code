/**
 * @author xiaosen
 * @date 2019/6/11 17:22
 * @description
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
