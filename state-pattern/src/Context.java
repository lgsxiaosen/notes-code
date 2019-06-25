/**
 * @author xiaosen
 * @date 2019/6/24 18:44
 * @description
 */
public class Context {
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void handle1(){
        this.state.handle1();
    }

    public void handle2(){
        this.state.handle2();
    }
}
