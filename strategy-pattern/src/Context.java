/**
 * @author xiaosen
 * @date 2019/6/10 19:14
 * @description
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void doSomething(){
        this.strategy.doSomething();
    }
}
