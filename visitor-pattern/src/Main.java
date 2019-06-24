public class Main {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        objectStructure.accept(visitor);
        System.out.println("-------------");
        Visitor visitor1 = new ConcreteVisitorB();
        objectStructure.accept(visitor1);
    }
}
