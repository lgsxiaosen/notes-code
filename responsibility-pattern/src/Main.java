public class Main {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNexthandler(handler2);
        handler1.handlerMessage(1);
        handler1.handlerMessage(2);
        handler1.handlerMessage(3);
        handler2.handlerMessage(1);
        handler2.handlerMessage(2);
        handler2.handlerMessage(3);
    }
}
