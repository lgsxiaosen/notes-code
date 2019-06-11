/**
 * @author xiaosen
 * @date 2019/6/10 19:12
 * @description
 */
public class ContreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1执行");
    }
}
