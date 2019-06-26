/**
 * @author xiaosen
 * @date 2019/6/26 16:32
 * @description
 */
public class ConcreteAbstraction extends Abstraction{

    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        System.out.println("具体抽象角色处理");
        super.implementor.doSomething();
        super.implementor.doAnything();
    }
}
