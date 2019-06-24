public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState1());
        context.handle1();
        context.handle2();
        System.out.println("------------");
        context.setState(new ConcreteState2());
        context.handle2();
        context.handle1();
    }
}
