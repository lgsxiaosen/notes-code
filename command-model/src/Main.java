public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        // 声明调用者Invoker
        Invoker invoker = new Invoker();
        // 定义接收者
        Receiver receiver = new ConcreteReciver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();

        Receiver receiver2 = new ConcreteReciver2();
        Command command2 = new ConcreteCommand2(receiver2);
        invoker.setCommand(command2);
        invoker.action();
    }
}
