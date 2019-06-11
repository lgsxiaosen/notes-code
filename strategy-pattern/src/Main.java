public class Main {

    public static void main(String[] args) {
        Strategy strategy1 = new ContreteStrategy1();
        Strategy strategy2 = new ContreteStrategy2();
        Context context1 = new Context(strategy1);
        Context context2 = new Context(strategy2);
        context1.doSomething();
        context2.doSomething();

    }
}
