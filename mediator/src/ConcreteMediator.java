/**
 * @author liuguisen
 * @date 2019/4/24 17:37
 * @description
 */
public class ConcreteMediator extends Mediator {
    private ColleagureA colleagureA;
    private ColleagureB colleagureB;

    public ColleagureA getColleagureA() {
        return colleagureA;
    }

    public void setColleagureA(ColleagureA colleagureA) {
        this.colleagureA = colleagureA;
    }

    public ColleagureB getColleagureB() {
        return colleagureB;
    }

    public void setColleagureB(ColleagureB colleagureB) {
        this.colleagureB = colleagureB;
    }

    @Override
    public void doSomething(Colleagure colleagure, String message) {
        if (colleagure==colleagureA){
            colleagureB.doSelfthing(message);
        }else {
            colleagureA.doSelfthing(message);
        }
    }
}
