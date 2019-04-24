public class Main {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagureA colleagureA = new ColleagureA(mediator);
        ColleagureB colleagureB = new ColleagureB(mediator);
        mediator.setColleagureA(colleagureA);
        mediator.setColleagureB(colleagureB);
        colleagureA.doMediaThing();
        colleagureB.doMediaThing();


    }
}
