/**
 * @author xiaosen
 * @date 2019/6/26 16:27
 * @description
 */
public class ConcreteImplementor1 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("具体实现角色1 处理业务1");
    }

    @Override
    public void doAnything() {
        System.out.println("具体实现角色1 处理业务2");
    }
}
