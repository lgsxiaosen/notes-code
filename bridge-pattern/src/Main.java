public class Main {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor1();
        Abstraction abstraction = new ConcreteAbstraction(implementor);
        abstraction.operation();
        Implementor implementor2 = new ConcreteImplementor2();
        Abstraction abstraction2 = new ConcreteAbstraction(implementor2);
        abstraction2.operation();
    }
}
