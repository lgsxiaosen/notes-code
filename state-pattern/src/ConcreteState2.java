/**
 * @author xiaosen
 * @date 2019/6/24 18:47
 * @description
 */
public class ConcreteState2 extends State {
    @Override
    void handle1() {
        super.context.setState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    void handle2() {
        System.out.println("ConcreteState2处理逻辑");
    }
}
