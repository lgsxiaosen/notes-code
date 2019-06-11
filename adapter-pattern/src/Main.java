public class Main {

    public static void main(String[] args) {
        // 原来的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        // 增加适配器角色后的逻辑
        Target target1 = new Adapter();
        target1.request();
    }
}
