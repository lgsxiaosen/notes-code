/**
 * @author xiaosen
 * @date 2019/6/24 18:46
 * @description
 */
public class ConcreteState1 extends State{
    @Override
    void handle1() {
        System.out.println("ConcreteState1处理逻辑");
    }

    @Override
    void handle2() {
        super.context.setState(Context.STATE2);
        super.context.handle2();
    }
}
